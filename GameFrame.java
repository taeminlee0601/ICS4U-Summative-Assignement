// import the needed packages
// javax.swing and java.awt=> used for the GUI
import javax.swing.*;
import java.awt.*;
import java.io.File;

/*
 * This class creates the main window of the game
 * Inherits object JFrame
 */
public class GameFrame extends JFrame {
    // Create the StartPanel object (object that inherits JPanel)
    private StartPanel startPanel = new StartPanel();

    /**
     * This creates the panels inside the frame.
     */
    public GameFrame() {
        // Initializing the Start Panel
        // Setting the path to the background file
        startPanel.setBackgroundFile(new File("assets/StartMenuBackground.jpg"));
        // Setting the path to the font file
        startPanel.setFontFile(new File("assets/BreatheFireIii-PKLOB.ttf"));
        // Adding the current frame to start panel
        startPanel.setFrame(this);
        // Creating the start panel
        startPanel.createPanel();
        
        // Adding the start panel
        getContentPane().add(startPanel);

        // Settings of the frame
        // Setting the size of the frame to 900x500
        setSize(900,500);
        // Setting the frame to not be resizeable
        setResizable(false);
        // Makeing the frame be able to be exited when the x is pressed
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Setting the window be on the middle of the screen
        setLocationRelativeTo(null);
        // Setting the title of the frame
        setTitle("Legend Battle Simulator");
        // Making the frame visible
        setVisible(true);
    }
}