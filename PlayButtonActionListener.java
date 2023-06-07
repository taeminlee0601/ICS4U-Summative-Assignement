// Import required packages
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

/*
 * This class is the action listener class of the play button in the start panel
 * Implements ActionLister
 */
public class PlayButtonActionListener implements ActionListener {
    // Create instance variables
    private StartPanel startPanel;
    // Create the next panel
    private CharacterSelectPanel selectPanel = new CharacterSelectPanel(null, null);
    private GameFrame frame;

    /**
     * This constructor will set the start panel and the frame
     * @param startPanel - Type: StartPanel (StartPanel of the game)
     * @param frame - Type: GameFrame (Main frame of the game)
     */
    public PlayButtonActionListener(StartPanel startPanel, GameFrame frame) {
        this.startPanel = startPanel;
        this.frame = frame;
    }

    /**
     * This method will check if the button is pressed and if yes will go to the next panel
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        // Initializes the settings of the next panel
        // Sets the backgroundFile of the character select panel
        selectPanel.setBackgroundFile(new File("assets/CharacterSelection.jpg"));
        // Sets the font file of the character select panel
        selectPanel.setFontFile(new File("assets/BreatheFireIii-PKLOB.ttf"));
        // Creates the elements inside the panel
        selectPanel.createPanel();

        // Sets the start panel to not be visible
        startPanel.setVisible(false);

        // Adds the character select panel to the frame
        frame.add(selectPanel);
    }
    
}
