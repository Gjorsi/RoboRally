package sky7.gui;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import java.util.HashMap;

public class BackGround {
	int windowWidth;
	int windowHeight;
	int scaler;
	HashMap<String, Texture> textures;
	SpriteBatch batch;
	
	public BackGround(int width, int height, int scaler, HashMap<String, Texture> textures, SpriteBatch batch) {
		windowWidth = width;
		windowHeight = height;
		this.scaler = scaler;
		this.textures = textures;
		this.batch = batch;
		
	}

	/**
	 * show the dock in screen.
	 */
	public void showDock() {
		/*
		 * go through the width and height of game window and print background/dock texture
		 */
		for (int i = 0; i < windowWidth; i++) {
			for (int j=0; j < windowHeight; j++) {
				batch.draw(textures.get("dock"), i * scaler, j*scaler);
			}
		}
		/*
		 * Render outline of cards in registry slots
		 * i = 5 because the registry starts at grid place 5
		 */
		for (int i = 5; i < 10; i++) {
			batch.draw(textures.get("outline"), i * scaler+64, scaler);
		}
	}
}
