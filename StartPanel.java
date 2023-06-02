import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.awt.image.BufferedImage;

public class StartPanel extends ParentPanel {
    private JButton playButton = new JButton();
    private JButton exitButton = new JButton();
    private JLabel title = new JLabel();

    public StartPanel() {
        
    }

    public StartPanel(File backgroundFile, File fontFile) {
        super(backgroundFile, fontFile);
        createPanel();
    }

    public void createPanel() {
        setVisible(true);
        setSize(900,500);
        setLayout(null);

        setBackground();
        createFont();

        playButton.setFont(customFont);
        exitButton.setFont(customFont);

        playButton.setText("Play");
        playButton.setOpaque(false);
        playButton.setContentAreaFilled(false);
        playButton.setBorderPainted(false);
        playButton.setBounds(250, getHeight()/2 + 50, 100, 100);
        playButton.setForeground(Color.WHITE);

        exitButton.setText("Exit");
        exitButton.setOpaque(false);
        exitButton.setContentAreaFilled(false);
        exitButton.setBorderPainted(false);
        exitButton.setBounds(getWidth()/2 + 250/2, getHeight()/2 + 50, 100, 100);
        exitButton.setForeground(Color.WHITE);

        playButton.addActionListener(new PlayButtonActionListener(this));
        exitButton.addActionListener(new ExitButtonActionListener());

        title.setText("Legend Battle Simulator");
        title.setFont(customFont.deriveFont(50f));
        title.setForeground(Color.WHITE);
        title.setBounds(getWidth()/4, getHeight()/2 - 100, 500, 100);

        add(playButton);
        add(exitButton);
        add(title);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.drawImage(background, 0, 0, this);  

        playButton.setFont(customFont);
    }
    
}
