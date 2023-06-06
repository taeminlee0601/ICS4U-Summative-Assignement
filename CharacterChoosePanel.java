import javax.swing.*;
import java.awt.*;

public class CharacterChoosePanel extends JPanel {
    private JButton leftButton = new JButton("<");
    private JButton rightButton = new JButton(">");
    
    public CharacterChoosePanel() {
        setVisible(true);
        setSize(900,500);
        setLayout(null);

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

    }

    @Override
    protected void paintComponent(Graphics g) {
        // TODO Auto-generated method stub
        super.paintComponent(g);

        
    }
    
}