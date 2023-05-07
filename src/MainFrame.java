import javax.swing.*;
import java.net.URL;

public class MainFrame extends JFrame {
    public MainFrame() {
        setTitle("AREA INTRUDERS");
        URL iconURL = getClass().getResource("icon.png");
        setIconImage(new ImageIcon(iconURL).getImage());
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        add(new MainPanel());

        pack();
        setVisible(true);
    }
}
