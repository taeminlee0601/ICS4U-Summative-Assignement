import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class PlayButtonActionListener implements ActionListener{
    private StartPanel startPanel;
    private CharacterSelectPanel selectPanel = new CharacterSelectPanel();
    private GameFrame frame;

    public PlayButtonActionListener(StartPanel startPanel, GameFrame frame) {
        this.startPanel = startPanel;
        this.frame = frame;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        selectPanel.setBackgroundFile(new File("assets/CharacterSelection.jpg"));
        selectPanel.setFontFile(new File("assets/BreatheFireIii-PKLOB.ttf"));
        selectPanel.createPanel();

        startPanel.setVisible(false);

        frame.add(selectPanel);

        System.out.println("test");
    }
    
}
