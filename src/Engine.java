import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Engine implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        JButton clickedButton = (JButton) e.getSource();
        String clickedButtonLabel = clickedButton.getText();
        JOptionPane.showConfirmDialog(null, "Хо нихуя! Ты нажал " + clickedButtonLabel + "!", "А чо так можно было?", JOptionPane.DEFAULT_OPTION);
    }
}
