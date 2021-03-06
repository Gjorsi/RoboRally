package sky7.gui;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import sky7.Client.IClient;
import sky7.board.ICell;
import sky7.board.cellContents.robots.RobotTile;

public class BoardPrinter {
	int width;
	int height;
	int scaler;
	SpriteBatch batch;

	public BoardPrinter(int width, int height, int scaler, SpriteBatch batch) {
		this.width = width;
		this.height = height;
		this.scaler = scaler;
		this.batch = batch;
	}

	/**
	 * draw the gameboard as a grid of width*height, each square at 128*128 pixels
 	 */
	public void showBoard(IClient game) {
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				for (ICell cell : game.gameBoard().getTileTexture(i, j)) {
					if (cell instanceof RobotTile) {
						int rotation = findRotation((RobotTile)cell);
						batch.draw(new TextureRegion(cell.getTexture()), (i+2)*scaler, (j+2)*scaler, scaler/2, scaler/2, scaler, scaler, 1, 1, rotation);
					} else {
						batch.draw(cell.getTexture(), (i+2) * scaler, (j + 2) * scaler, scaler, scaler);
					}

				}
			}
		}
	}

	/**
	 * Find rotation of a robot
	 */
	private int findRotation(RobotTile robot) {
		switch (robot.getOrientation()) {
			case EAST:
				return 270;
			case SOUTH:
				return 180;
			case WEST:
				return 90;
			default:
				return 0;
		}
	}
}
