package sokoban;

import javax.swing.JFrame;

public final class Main extends JFrame {

    private final int OFFSET = 30;

    public Main() {
        InitUI();
    }

    public void InitUI() {
        Board board = new Board();
        add(board);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(board.getBoardWidth() + OFFSET,
                board.getBoardHeight() + 2 * OFFSET);
        setLocationRelativeTo(null);
        setTitle("Sokoban");
    }

    public static void main(String[] args) {
        Main sokoban = new Main();
        sokoban.setVisible(true);
    }
}
