package sky7.board.cellContents.Active;

import com.badlogic.gdx.graphics.Texture;
import sky7.board.ICell;
import sky7.board.cellContents.IActive;

public class Belt implements IActive{
    private int direction;
    private int type;
    private static final int PRIORITY = 1;

    public Belt(int direction, int type){

        this.direction = direction;
        this.type = type;
    }

    @Override
    public Texture getTexture() {
        return null; //TODO: add Belt Texture
    }

    @Override
    public int drawPriority() {
        return PRIORITY;
    }

    @Override
    public int compareTo(ICell o) {
        return 0;
    }
}
