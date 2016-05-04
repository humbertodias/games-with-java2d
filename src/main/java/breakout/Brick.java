package breakout;

public class Brick extends Sprite {

    private boolean destroyed;

    public Brick(int x, int y) {
        super(x,y, "brick.png");

        i_width = image.getWidth(null);
        i_heigth = image.getHeight(null);

        destroyed = false;
    }

    public boolean isDestroyed() {
        
        return destroyed;
    }

    public void setDestroyed(boolean val) {
        
        destroyed = val;
    }
}
