import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.awt.image.BufferedImage;

public class ParentPanel extends JPanel {
    protected BufferedImage bufferedBackground;
    protected Image background;
    protected File backgroundFile;
    protected File fontFile;
    protected Font customFont;
    protected ParentPanel nextPanel;
    protected GameFrame frame;
    
    public ParentPanel() {
        
    }

    public ParentPanel(File backgroundFile, File fontFile) {
        this.backgroundFile = backgroundFile;
        this.fontFile = fontFile;
    }

    public void setBackground() {
        try {
            bufferedBackground = ImageIO.read(backgroundFile);
            background = bufferedBackground.getScaledInstance(900, 500, Image.SCALE_DEFAULT);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void createFont() {
        try {
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            customFont = Font.createFont(Font.TRUETYPE_FONT, fontFile).deriveFont(30f);
            ge.registerFont(customFont);
        } catch (IOException e) {
                //Handle exception
            e.printStackTrace();
        } catch (FontFormatException e) {
            e.printStackTrace();
        }
    }

    public void setBackgroundFile(File backgroundFile) {
        this.backgroundFile = backgroundFile;
    }

    public void setFontFile(File fontFile) {
        this.fontFile = fontFile;
    }

    public void setNextPanel(ParentPanel panel) {
        this.nextPanel = panel;
    }

    public void setFrame(GameFrame frame) {
        this.frame = frame;
    }
}
