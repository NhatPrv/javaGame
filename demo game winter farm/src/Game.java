import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Game {
    private JFrame frame;
    private JLabel label;
    private int x = 100;
    private int y = 100;

    Game() {
        frame = new JFrame("Demo game");
        frame.setSize(800, 600);

        BufferedImage originalImage = loadImage("C:/DATA/java/game/demo game winter farm/assets/images/player.png");

        BufferedImage resizedImage = resizeImage(originalImage, 32, 32);

        label = new JLabel(new ImageIcon(resizedImage));
        label.setBounds(x, y, 32, 32);
        label.setBounds(x+200, y, 32, 32);

        frame.add(label);
        frame.setLayout(null);

        // Thêm sự kiện phím
        frame.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
                handleKeyPress(e);
            }

            @Override
            public void keyReleased(KeyEvent e) {
            }
        });

        frame.setFocusable(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    private BufferedImage loadImage(String fileName) {
        try {
            return ImageIO.read(new File(fileName));
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error loading image: " + e.getMessage());
            return null;
        }
    }

    private BufferedImage resizeImage(BufferedImage originalImage, int targetWidth, int targetHeight) {
        Image resultingImage = originalImage.getScaledInstance(targetWidth, targetHeight, Image.SCALE_DEFAULT);
        BufferedImage outputImage = new BufferedImage(targetWidth, targetHeight, BufferedImage.TYPE_INT_ARGB);

        Graphics2D g2d = outputImage.createGraphics();
        g2d.drawImage(resultingImage, 0, 0, null);
        g2d.dispose();

        return outputImage;
    }

    private void handleKeyPress(KeyEvent e) {
        int keyCode = e.getKeyCode();
        switch (keyCode) {
            case KeyEvent.VK_UP:
                moveLabel(0, -5);
                break;
            case KeyEvent.VK_DOWN:
                moveLabel(0, 5);
                break;
            case KeyEvent.VK_LEFT:
                moveLabel(-5, 0);
                break;
            case KeyEvent.VK_RIGHT:
                moveLabel(5, 0);
                break;
        }
    }

    private void moveLabel(int deltaX, int deltaY) {
        x += deltaX;
        y += deltaY;
        label.setBounds(x, y, 32, 32);
    }

    public static void main(String[] args) {
        new Game();
    }
}
