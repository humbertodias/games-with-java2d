package spacecraft;

public class Alien extends Sprite {

    private final int INITIAL_X = 400;

    public Alien(int x, int y) {
        super(x, y, "alien.png");
        initAlien();
    }

    private void initAlien() {

        getImageDimensions();
    }

    public void move() {

        if (x < 0) {
            x = INITIAL_X;
        }

        x -= 1;
    }
}
