// import required packages
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;

public class CharacterSelectPanel extends ParentPanel {
    private JButton leftButton = new JButton();
    private JButton rightButton = new JButton();
    private JButton[] buttonArray = new JButton[3];
    private JLabel typeTitle = new JLabel();
    private JLabel[] nameArray = new JLabel[3];
    private Legends[] currentDisplayed = new Legends[3];
    private HashMap<String, ArrayList<Legends>> legendsMap = new HashMap<String, ArrayList<Legends>>();
    private ArrayList<String> legendType = new ArrayList<String>();
    private ArrayList<Legends> player1 = new ArrayList<Legends>();
    private ArrayList<Legends> player2 = new ArrayList<Legends>();
    private boolean[] hasPopupOpened = {false};
    
    public CharacterSelectPanel() {
        setCharacterHashMap();
    }

    public CharacterSelectPanel(ArrayList<Legends> player1, boolean[] hasPopupOpened, HashMap<String,ArrayList<Legends>> legendsMap,
            ArrayList<String> legendsType) {
        this.player1 = player1;
        this.hasPopupOpened = hasPopupOpened;
        this.legendsMap = legendsMap;
        this.legendType = legendsType;

        setToStartTypeList();
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

        leftButton.addActionListener(new SelectLeftButtonActionListener(buttonArray, legendType, legendsMap, typeTitle, nameArray, currentDisplayed));
        rightButton.addActionListener(new SelectRightButtonActionListener(buttonArray, legendType, legendsMap, typeTitle, nameArray, currentDisplayed));

        buttonArray[0].addActionListener(new CharacterSelectButtonActionListener(currentDisplayed, 0, player1, player2, frame, 
            hasPopupOpened, this, legendsMap, legendType));
        buttonArray[1].addActionListener(new CharacterSelectButtonActionListener(currentDisplayed, 1, player1, player2, frame, 
            hasPopupOpened, this, legendsMap, legendType));
        buttonArray[2].addActionListener(new CharacterSelectButtonActionListener(currentDisplayed, 2, player1, player2, frame, 
            hasPopupOpened, this, legendsMap, legendType));

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

    public void setToStartTypeList() {
        while (!legendType.get(0).equals("Outer Gods")) {
            String temp = legendType.remove(0);
            legendType.add(temp);

            System.out.println(legendType);
        }
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.drawImage(background, 0, 0, this);
    }

}
