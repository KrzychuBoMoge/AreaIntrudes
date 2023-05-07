import javax.swing.*;
import java.awt.*;

public class MainPanel extends JPanel {
    public static JPanel startPanel;
    public static JPanel gamePanel;
    public MainPanel() {
        setPreferredSize(new Dimension(710,610));
        setBackground(Color.black);
        setLayout(null);
        startPanel = new StartPanel();
        gamePanel = new GamePanel();

        add(startPanel);
        add(gamePanel);
    }
}
