import javax.swing.JFrame;

public class RainWindow extends JFrame {
    public static final int size= 500;

    public RainWindow() {
        super("Welcome to Rain Simulator!");
        setSize(size * 16 / 9, size);
        add(new RainPanel());
        setResizable(false);
    }
}
