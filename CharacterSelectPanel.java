import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.awt.image.BufferedImage;

public class CharacterSelectPanel extends ParentPanel {
    private JButton leftButton = new JButton();
    private JButton rightButton = new JButton();
    private JButton yog = new JButton(new ImageIcon("assets/yog-sothoth.jpg"));
    
    public CharacterSelectPanel() {

    }

    public CharacterSelectPanel(File backgroundFile, File fontFile) {
        super(backgroundFile, fontFile);

    }

    public void createPanel() {
        setVisible(true);
        setSize(900,500);
        setLayout(null);

        setBackground();
        createFont();

        leftButton.setFont(customFont);
        rightButton.setFont(customFont);
        
        yog.setBounds(getWidth()/2, getHeight()/2, 100, 122);

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
        add(yog);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.drawImage(background, 0, 0, this);
    }

}
