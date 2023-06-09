import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.*;

public class SelectRightButtonActionListener implements ActionListener {
    private JButton[] buttonArray;
    private ArrayList<String> legendType;
    private HashMap<String, ArrayList<Legends>> legendsMap;
    private JLabel typeTitle;
    private JLabel[] nameArray;

    public SelectRightButtonActionListener(JButton[] buttonArray, ArrayList<String> legendType, HashMap<String,ArrayList<Legends>> legendsMap, JLabel typeTitle, JLabel[] nameArray) {
        this.buttonArray = buttonArray;
        this.legendType = legendType;
        this.legendsMap = legendsMap;
        this.typeTitle = typeTitle;
        this.nameArray = nameArray;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String currentType = legendType.remove(legendType.size()-1);

        typeTitle.setText(currentType);

        for (int a = 0; a < buttonArray.length; a++) {
            buttonArray[a].setIcon(new ImageIcon(FileFunctions.resizeImage(legendsMap.get(currentType).get(a).getImageFile(),228, 275)));
            nameArray[a].setText(legendsMap.get(currentType).get(a).getName());
        }

        legendType.add(0, currentType);
    }
}
