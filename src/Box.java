import java.io.Serializable;
import java.util.Random;

public class Box implements Serializable {
    private final int x;
    private final int y;
    private final int z;

    public Box(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public int getVolume() {return this.x * this.y * this.z;}
    public int getX() { return x; }
    public int getY() { return y; }
    public int getZ() { return z; }

    private static final Random RANDOM = new Random();

    public static Box[] createArrayBoxes(int count) {
        Box[] boxes = new Box[count];
        for (int i = 0; i < count; i++) {
            boxes[i] = new Box(
                    RANDOM.nextInt(1,5),
                    RANDOM.nextInt(1,5),
                    RANDOM.nextInt(1,5)
            );
        }
        return boxes;
    }

    @Override
    public String toString() {
        return String.format(
                "Box {%s %s %s}\n",
                x,
                y,
                z
                );

    }
}

