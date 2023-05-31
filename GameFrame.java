import javax.swing.*;
import java.awt.*;

public class GameFrame extends JFrame {
    private StartPanel startPanel = new StartPanel();

    public GameFrame() {
        setSize(900,500);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setTitle("Legend Battle Simulator");
        setVisible(true);

        getContentPane().add(startPanel);
    }
}