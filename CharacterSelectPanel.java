import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.awt.image.BufferedImage;

public class CharacterSelectPanel extends ParentPanel {
    private JButton leftButton = new JButton();
    private JButton rightButton = new JButton();
    private JButton[] buttonArray = new JButton[3];
    private HashMap<String, ArrayList<legends>> legendsMap = new HashMap<String, ArrayList<legends>>();
    
    /**
     * 
     * @param backgroundFile This is nullable
     * @param fontFile This is nullable
     */
    public CharacterSelectPanel(File backgroundFile, File fontFile) {
        super(backgroundFile, fontFile);
    }

    public void createPanel() {

        for (int a = 0; a < buttonArray.length; a++) {
            buttonArray[a] = new JButton();
            buttonArray[a].setBounds(75+(a*253),25,228,275);
        }

        setVisible(true);
        setSize(900,500);
        setLayout(null);

        setBackground();
        createFont();

        leftButton.setFont(customFont);
        rightButton.setFont(customFont);

        leftButton.setText("<");
        leftButton.setOpaque(false);
        leftButton.setContentAreaFilled(false);
        leftButton.setBorderPainted(false);
        leftButton.setBounds(0, 0, 50, 500);
        leftButton.setForeground(Color.WHITE);

        rightButton.setText(">");
        rightButton.setOpaque(false);
        rightButton.setContentAreaFilled(false);
        rightButton.setBorderPainted(false);
        rightButton.setBounds(835, 0, 50, 500);
        rightButton.setForeground(Color.WHITE);

        add(leftButton);
        add(rightButton);
        
        for (int a = 0; a < buttonArray.length; a++) {
            add(buttonArray[a]);
        }
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.drawImage(background, 0, 0, this);
    }

}
