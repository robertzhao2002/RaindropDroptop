import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.JPanel;

public class RainPanel extends JPanel {
    private ArrayList<Raindrop> raindrops;

    public RainPanel() {
        raindrops= new ArrayList<Raindrop>();
    }

    @Override
    public void paint(Graphics g) {
        for (Raindrop r : raindrops) {
            r.paint(g);
        }
    }

}
