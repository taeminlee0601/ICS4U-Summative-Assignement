import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PlayButtonActionListener implements ActionListener{
    private StartPanel startPanel;

    public PlayButtonActionListener(StartPanel startPanel) {
        this.startPanel = startPanel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        startPanel.setVisible(false);
        System.out.println("test");
    }
    
}
