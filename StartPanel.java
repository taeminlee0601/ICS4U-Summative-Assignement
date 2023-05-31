// Import correct libraries/modules
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

/*
 * This class will create the start screen of the game. This is the GUI component.
 */

// Extend the JPanel class
public class StartPanel extends JPanel {
    // Create Instance Variables
    // Create a JButton for the play button
    private JButton playButton = new JButton();
    // Create a JButton for the exit button
    private JButton exitButton = new JButton();
    // Create a Buffered Image for the background image (to rescale)
    private BufferedImage bufferedBackground;
    // Create a Image Object to draw the image on the screen
    private Image background;
    private Font customFont;
    private JLabel title = new JLabel();

    public StartPanel() {
        setVisible(true);
        setSize(900,500);
        setLayout(null);

        try {
            bufferedBackground = ImageIO.read(new File("assets/StartMenuBackground.jpg"));
            background = bufferedBackground.getScaledInstance(900, 500, Image.SCALE_DEFAULT);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            customFont = Font.createFont(Font.TRUETYPE_FONT, new File("assets/BreatheFireIii-PKLOB.ttf")).deriveFont(30f);
            ge.registerFont(customFont);
        } catch (IOException e) {
                //Handle exception
            e.printStackTrace();
        } catch (FontFormatException e) {
            e.printStackTrace();
        }

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
