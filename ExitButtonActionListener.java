import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ExitButtonActionListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Exiting");
        System.exit(0);
    }
    
}
