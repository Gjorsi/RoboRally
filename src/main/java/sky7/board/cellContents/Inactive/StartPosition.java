package sky7.board.cellContents.Inactive;

import com.badlogic.gdx.graphics.Texture;
import sky7.board.ICell;
import sky7.board.cellContents.IInactive;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class StartPosition implements IInactive {
    private int startNumber;
    private final int PRIORITY = 2;
    private Texture texture;

    public StartPosition(int startNumber) {
        this.startNumber = startNumber;
    }


    @Override
    public Texture getTexture() {
        if (texture == null) {
            texture = new Texture("assets/startposition/"+startNumber+".png");
        }
        return texture;
    }

    @Override
    public int drawPriority() {
        return PRIORITY;
    }

    @Override
    public int compareTo(ICell other) {
        return Integer.compare(this.drawPriority(), other.drawPriority());
    }

    public static List<AbstractMap.SimpleEntry<String, Supplier<ICell>>> getSuppliers() {
        List<AbstractMap.SimpleEntry<String, Supplier<ICell>>> suppliers = new ArrayList<>();
        int maxNrOfPlayer = 8;
        for (int i = 0; i < maxNrOfPlayer; i++) {
            final int pos = i+1;
            suppliers.add(new AbstractMap.SimpleEntry<>("s" + pos, () -> new StartPosition(pos)));
        }
        return suppliers;
    }

    /**
     * the number of this start position
     *
     * @return integer representing number of start position
     */
    public int getNumber() {
        return startNumber;
    }
}
