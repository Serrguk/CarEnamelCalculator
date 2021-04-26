import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = getFrame();

    }

    static JFrame getFrame() {
        JFrame frame = new JFrame("Расчёт объёма");
        frame.setVisible(true);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        frame.setBounds(dimension.width / 2 - 300, dimension.height / 2 - 200, 600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        Checkbox checkbox = new Checkbox("Густая");
        JLabel currentCount = new JLabel("Текущее количество эмали");
        JTextField really = new JTextField(10);
        panel.add(currentCount);
        panel.add(really);
        panel.add(checkbox);
        JButton calculation = new JButton("Рассчитать");
        panel.add(calculation);
        frame.setContentPane(panel);
        return frame;
    }
}
