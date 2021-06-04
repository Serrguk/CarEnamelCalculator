import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Engine implements ActionListener {

    Frame parent;
    double firstTextField;
    double secondTextField;
    public Engine(Frame parent) {
        this.parent = parent;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String message;

        if ("".equals(parent.really.getText()) || "".equals(parent.ended.getText())) {
            JOptionPane.showConfirmDialog(parent, "Имеются незаполненные поля!", "Ошибка", JOptionPane.DEFAULT_OPTION);
        } else {
            try {
                firstTextField = Double.parseDouble(parent.really.getText());
                secondTextField = Double.parseDouble(parent.ended.getText());

                if (!parent.checkbox.getState() && !parent.checkboxEnded.getState()) {
                    message = String.format("Нужно долить %.2f граммов готовой, для этого все компоненты умножьте на %.2f",
                            (secondTextField - firstTextField), ((secondTextField - firstTextField)) / firstTextField);
                    JOptionPane.showConfirmDialog(parent, message, "Результат", JOptionPane.DEFAULT_OPTION);
                } else if (!parent.checkbox.getState() && parent.checkboxEnded.getState()) {
                    message = String.format("Нужно долить %.2f граммов готовой (%.2f густой), для этого все компоненты умножьте на %.2f." +
                                    "\nЕсли эмаль нужна в густом виде, просто не наливайте разбавитель.",
                            (secondTextField * 1.5 - firstTextField),((secondTextField * 1.5 - firstTextField) / 1.5),
                            ((secondTextField * 1.5 - firstTextField)) / firstTextField);
                    JOptionPane.showConfirmDialog(parent, message, "Результат", JOptionPane.DEFAULT_OPTION);
                } else if (parent.checkbox.getState() && !parent.checkboxEnded.getState()) {
                    message = String.format("Нужно долить %.2f граммов густой (%.2f готовой), для этого все компоненты умножьте на %.2f." +
                                    "\nВ случае необходимости долить %.2f грамма разбавителя.",
                            (secondTextField / 1.5 - firstTextField),((secondTextField / 1.5 - firstTextField) * 1.5),
                            ((secondTextField / 1.5 - firstTextField)) / firstTextField, (((secondTextField / 1.5 - firstTextField) / 100) * 60));
                    JOptionPane.showConfirmDialog(parent, message, "Результат", JOptionPane.DEFAULT_OPTION);
                } else {
                    message = String.format("Нужно долить %.2f граммов густой, для этого все компоненты умножьте на %.2f." +
                                    "\nВ случае необходимости долить %.2f грамма разбавителя.",
                            (secondTextField - firstTextField), (secondTextField - firstTextField) / firstTextField, ((secondTextField - firstTextField) / 1.5));
                    JOptionPane.showConfirmDialog(parent, message, "Результат", JOptionPane.DEFAULT_OPTION);
                }
                parent.really.setText("");
                parent.ended.setText("");
                parent.checkbox.setState(false);
                parent.checkboxEnded.setState(false);

            } catch (NumberFormatException nfe) {
                JOptionPane.showConfirmDialog(parent, "Неверный формат ввода!", "Ошибка", JOptionPane.DEFAULT_OPTION);
            }
        }
    }
}
