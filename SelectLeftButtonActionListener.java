import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.*;

public class SelectLeftButtonActionListener implements ActionListener{
    private JButton[] buttonArray;
    private ArrayList<String> legendType;
    private HashMap<String, ArrayList<legends>> legendsMap;

    public SelectLeftButtonActionListener(JButton[] buttonArray, ArrayList<String> legendType, HashMap<String,ArrayList<legends>> legendsMap) {
        this.buttonArray = buttonArray;
        this.legendType = legendType;
        this.legendsMap = legendsMap;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String currentType = legendType.remove(0);

        for (int a = 0; a < buttonArray.length; a++) {
            buttonArray[a].setIcon(new ImageIcon(FileFunctions.resizeImage(legendsMap.get(currentType).get(a).getImageFile(),228, 275)));
        }

        legendType.add(currentType);
    }
}
