import javax.swing.*;
import java.awt.*;
import java.io.File;

public class GameFrame extends JFrame {
    private StartPanel startPanel = new StartPanel();

    public GameFrame() {
        startPanel.setBackgroundFile(new File("assets/StartMenuBackground.jpg"));
        startPanel.setFontFile(new File("assets/BreatheFireIii-PKLOB.ttf"));
        startPanel.setFrame(this);
        startPanel.createPanel();
        
        getContentPane().add(startPanel);

        setSize(900,500);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setTitle("Legend Battle Simulator");
        setVisible(true);
    }
}