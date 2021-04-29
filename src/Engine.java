import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Engine implements ActionListener {

    Frame parent;
    double firstTextField;
    double secondTextField;
    boolean firstCheckBox;
    boolean secondCheckBox;

    public Engine(Frame parent) {
        this.parent = parent;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton clickedButton = (JButton) e.getSource();
        String clickedButtonLabel = clickedButton.getText();

        if ("".equals(parent.really.getText()) || "".equals(parent.ended.getText())) {
            JOptionPane.showConfirmDialog(parent, "Незаполненные поля детектед!", "Еррор блеадь!", JOptionPane.DEFAULT_OPTION);
        } else {
            try {
                firstTextField = Double.parseDouble(parent.really.getText());
                secondTextField = Double.parseDouble(parent.ended.getText());
                JOptionPane.showConfirmDialog(parent, "Заебись! Здесь буит результат!", "Чотко!", JOptionPane.DEFAULT_OPTION);
                parent.really.setText("");
                parent.ended.setText("");
                parent.checkbox.setState(false);
                parent.checkboxEnded.setState(false);

            } catch (NumberFormatException nfe) {
                JOptionPane.showConfirmDialog(parent, "Неверный формат ввода!", "Хуйня какая-то...", JOptionPane.DEFAULT_OPTION);
            }
        }
    }
}
