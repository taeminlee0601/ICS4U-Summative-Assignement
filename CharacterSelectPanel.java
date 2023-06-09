// import required packages
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class CharacterSelectPanel extends ParentPanel {
    private JButton leftButton = new JButton();
    private JButton rightButton = new JButton();
    private JButton[] buttonArray = new JButton[3];
    private JLabel typeTitle = new JLabel();
    private JLabel[] nameArray = new JLabel[3];
    private JLabel[] descriptionArray = new JLabel[3];
    private Legends[] currentDisplayed = new Legends[3];
    private HashMap<String, ArrayList<Legends>> legendsMap = new HashMap<String, ArrayList<Legends>>();
    private ArrayList<String> legendType = new ArrayList<String>();
    
    public CharacterSelectPanel() {
        setCharacterHashMap();
    }

    /**
     * This will set the background file and font file
     * @param backgroundFile - Type: File (File of the Background Image)
     * @param fontFile - Type: File (File of the font)
     */
    public CharacterSelectPanel(File backgroundFile, File fontFile) {
        super(backgroundFile, fontFile);
    }

    public void createPanel() {
        setVisible(true);
        setSize(900,900);
        setLayout(null);

        setBackground();
        createFont();

        for (int a = 0; a < buttonArray.length; a++) {            
            currentDisplayed[a] = legendsMap.get(legendType.get(0)).get(a);

            buttonArray[a] = new JButton();
            buttonArray[a].setBounds(75+(a*253), 115,228,275);
            buttonArray[a].setIcon(new ImageIcon(FileFunctions.resizeImage(currentDisplayed[a].getImageFile(), 228, 275)));

            nameArray[a] = new JLabel();
            nameArray[a].setFont(customFont.deriveFont(30f));
            nameArray[a].setForeground(Color.WHITE);
            nameArray[a].setText(currentDisplayed[a].getName());
            nameArray[a].setHorizontalAlignment(SwingConstants.CENTER);
            nameArray[a].setBounds(75+(a*253), 375, 228, 100);

            
        }

        typeTitle.setFont(customFont);
        typeTitle.setText(legendType.get(0));
        typeTitle.setBounds(getWidth()/2 - 255, 25, 500, 65);
        typeTitle.setHorizontalAlignment(SwingConstants.CENTER);
        typeTitle.setForeground(Color.WHITE);

        leftButton.setFont(customFont.deriveFont(30f));
        rightButton.setFont(customFont.deriveFont(30f));

        leftButton.setText("<");
        leftButton.setOpaque(false);
        leftButton.setContentAreaFilled(false);
        leftButton.setBorderPainted(false);
        leftButton.setBounds(0, 0, 50, 600);
        leftButton.setForeground(Color.WHITE);

        rightButton.setText(">");
        rightButton.setOpaque(false);
        rightButton.setContentAreaFilled(false);
        rightButton.setBorderPainted(false);
        rightButton.setBounds(835, 0, 50, 600);
        rightButton.setForeground(Color.WHITE);

        leftButton.addActionListener(new SelectLeftButtonActionListener(buttonArray, legendType, legendsMap, typeTitle, nameArray));
        rightButton.addActionListener(new SelectRightButtonActionListener(buttonArray, legendType, legendsMap, typeTitle, nameArray));

        add(leftButton);
        add(rightButton);
        add(typeTitle);

        for (int a = 0; a < buttonArray.length; a++) {
            add(buttonArray[a]);
            add(nameArray[a]);
        }
    }

    public void setCharacterHashMap() {
        legendType.add("Outer Gods");
        legendType.add("Meme Gods");
        legendType.add("Norse Gods");
        legendType.add("Egyptian Gods");
        legendType.add("Olympus Gods");

        for (int a = 0; a < legendType.size(); a++) {
            legendsMap.put(legendType.get(a), new ArrayList<Legends>());
        }

        LegendsInfo legendsInfo = new LegendsInfo();

        ArrayList<Legends> legendList = legendsInfo.getLegendsList();

        int count = 0;

        for (int a = 0; a < legendList.size(); a++) {
            if (a % 3 == 0 && a > 0) {
                count++;
            }
            
            legendsMap.get(legendType.get(count)).add(legendList.get(a));
        }
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.drawImage(background, 0, 0, this);
    }

}
