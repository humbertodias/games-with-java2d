package sokoban;

public class Player extends Actor {

    public Player(int x, int y) {
        super(x, y, "sokoban.png");
    }

    public void move(int x, int y) {
        int nx = this.x() + x;
        int ny = this.y() + y;
        this.setX(nx);
        this.setY(ny);
    }
}
