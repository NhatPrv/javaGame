import javax.swing.JFrame;
//import javax.swing.SwingUtilities;

public class SnakeGame extends JFrame {

    // public SnakeGame() {
    //     add(new GamePanel());
    //     setTitle("Snake Game");
    //     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    //     pack();
    //     setLocationRelativeTo(null);
    //     setResizable(false);
    //     setVisible(true);
    // }

    // public static void main(String[] args) {
    //     SwingUtilities.invokeLater(() -> new SnakeGame());
    // }

    public static void main(String[] args) {
        new GameFrame();
    }
}