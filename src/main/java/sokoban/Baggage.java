package sokoban;

public class Baggage extends Actor {

    public Baggage(int x, int y) {
        super(x, y, "baggage.png");
    }

    public void move(int x, int y) {
        int nx = this.x() + x;
        int ny = this.y() + y;
        this.setX(nx);
        this.setY(ny);
    }
}
