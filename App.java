import javax.swing.*;
public class App {
    public static void main(String[] args) throws Exception {
        int bwidth = 600;
        int bheight = bwidth;

        JFrame frame = new JFrame("Snake game");
        frame.setVisible(true);
        frame.setSize(bwidth,bheight);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Snake snake = new Snake(bwidth,bheight);
        frame.add(snake);
        frame.pack();
        snake.requestFocus();
    }
}