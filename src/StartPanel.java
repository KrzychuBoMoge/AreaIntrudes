import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class StartPanel extends JPanel {
    public StartPanel() {
        setBackground(Color.black);
        setBounds(5,5,700,600);
        setLayout(null);
        setBorder(new LineBorder(Color.green,1));

        JLabel jLabel = new JLabel("AREA INTRUDES");
        jLabel.setFont(new Font("Terminal",Font.BOLD,48));
        jLabel.setBounds(150,100,500,48);
        jLabel.setForeground(Color.GREEN);

        JButton jButton = new JButton("START");
        jButton.setBounds(300,300,100,70);
        jButton.setBackground(Color.BLACK);
        jButton.setBorder(null);
        jButton.setForeground(Color.green);
        jButton.setFont(new Font("Terminal",Font.BOLD,30));
        jButton.addActionListener((actionEvent) ->{
            this.setVisible(false);
            MainPanel.gamePanel.setVisible(true);
        });

        JMenu jMenu = new JMenu("Menu");
        jMenu.setBackground(Color.BLACK);
        jMenu.setBorder(new LineBorder(Color.green,1));
        JMenuBar jMenuBar = new JMenuBar();
        jMenuBar.setBounds(0,0,700,30);
        jMenuBar.setBackground(Color.BLACK);
        jMenuBar.setBorder(new LineBorder(Color.green,1));
        jMenu.add(new JMenuItem("Start"));
        jMenu.add(new JMenuItem("Rules"));
        jMenu.add(new JMenuItem("High Score"));
        jMenuBar.add(jMenu);

        add(jMenuBar);
        add(jLabel);
        add(jButton);
    }
}
