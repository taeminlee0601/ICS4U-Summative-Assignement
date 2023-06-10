import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;

public class CharacterSelectButtonActionListener implements ActionListener {
    private Legends[] currentDisplayed;
    private int index;
    private ArrayList<Legends> player1;
    private ArrayList<Legends> player2;
    private GameFrame frame;
    public boolean[] hasPopupOpened;
    private int response = 0;
    private CharacterSelectPanel currentPanel;

    /**
     * Sets the current displayed characters and sets which character is displayed on button
     * @param currentDisplayed
     * @param index
     */
    public CharacterSelectButtonActionListener(Legends[] currentDisplayed, int index, ArrayList<Legends> player1, 
            ArrayList<Legends> player2, GameFrame frame, boolean[] hasPopupOpened, CharacterSelectPanel currentPanel) {
        this.currentDisplayed = currentDisplayed;
        this.index = index;
        this.player1 = player1;
        this.player2 = player2;
        this.frame = frame;
        this.hasPopupOpened = hasPopupOpened;
        this.currentPanel = currentPanel;
    }

    public void printPicks() {

        System.out.println("Player 1");

        for (int a = 0; a < player1.size(); a++ ) {
            System.out.println(player1.get(a).getName());
        }

        System.out.println();

        System.out.println("Player 2");

        for (int a = 0; a < player2.size(); a++ ) {
            System.out.println(player2.get(a).getName());
        }

        System.out.println();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (player1.size() < 3) {
            if (!player1.contains(currentDisplayed[index])) {
                player1.add(currentDisplayed[index]);
            } else {
                JOptionPane.showMessageDialog(frame, "You cannot select the same legend twice!");
            }

            if (player1.size() < 3) {
                return;
            }
        }

        if (player1.size() == 3 && !hasPopupOpened[0]) {
            response = JOptionPane.showConfirmDialog(frame, "Player 1 has selected " + 
                player1.get(0).getName() + ", " + player1.get(1).getName() + ", " + player1.get(2).getName() + ".",
                "Confirm", JOptionPane.YES_NO_OPTION);
            hasPopupOpened[0] = true;

            if (response == JOptionPane.NO_OPTION) {
                CharacterSelectPanel selectPanel = new CharacterSelectPanel();

                // Initializes the settings of the next panel
                // Sets the main frame
                selectPanel.setFrame(frame);
                // Sets the backgroundFile of the character select panel
                selectPanel.setBackgroundFile(new File("assets/CharacterSelection.jpg"));
                // Sets the font file of the character select panel
                selectPanel.setFontFile(new File("assets/BreatheFireIii-PKLOB.ttf"));
                // Creates the elements inside the panel
                selectPanel.createPanel();

                // Sets the start panel to not be visible
                currentPanel.setVisible(false);

                // Adds the character select panel to the frame
                frame.add(selectPanel);

                JOptionPane.showMessageDialog(frame, "Player 1: Choose 3 characters by clicking on the Character's image");
            } else {
                JOptionPane.showMessageDialog(frame, "Player 2: Choose 3 characters by clicking on the character's image");
            }

            return;
        }

        

        if (player2.size() < 3) {
            if (!player2.contains(currentDisplayed[index]) && !player1.contains(currentDisplayed[index])) {
                player2.add(currentDisplayed[index]);
            } else {
                JOptionPane.showMessageDialog(frame, "You cannot select the same legend twice!");
            }
        }

        if (player2.size() == 3) {
            response = JOptionPane.showConfirmDialog(frame, "Player 2 has selected " + 
                player2.get(0).getName() + ", " + player2.get(1).getName() + ", " + player2.get(2).getName() + ".",
                "Confirm", JOptionPane.YES_NO_OPTION);
            hasPopupOpened[0] = true;

            if (response == JOptionPane.NO_OPTION) {
                CharacterSelectPanel selectPanel = new CharacterSelectPanel(player1, hasPopupOpened);

                // Initializes the settings of the next panel
                // Sets the main frame
                selectPanel.setFrame(frame);
                // Sets the backgroundFile of the character select panel
                selectPanel.setBackgroundFile(new File("assets/CharacterSelection.jpg"));
                // Sets the font file of the character select panel
                selectPanel.setFontFile(new File("assets/BreatheFireIii-PKLOB.ttf"));
                // Creates the elements inside the panel
                selectPanel.createPanel();

                // Sets the start panel to not be visible
                currentPanel.setVisible(false);

                // Adds the character select panel to the frame
                frame.add(selectPanel);

                JOptionPane.showMessageDialog(frame, "Player 2: Choose 3 characters by clicking on the Character's image");
            } else {
                printPicks();
            }

            return;
        }

    }
}
