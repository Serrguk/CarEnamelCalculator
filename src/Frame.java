import javax.swing.*;
import java.awt.*;
import java.util.Objects;

public class Frame extends JFrame {


    public JFrame getFrame() {
        JFrame frame = new JFrame("Расчёт объёма");
        JPanel panel = new JPanel();
        JPanel endedPanel = new JPanel();
        JLabel currentCount = new JLabel("Текущее количество эмали");
        JTextField really = new JTextField(10);
        Checkbox checkbox = new Checkbox("Густая");
        JButton calculation = new JButton("Рассчитать");
        calculation.setBackground(Color.CYAN);
        JLabel endedCount = new JLabel("Требуемое количество эмали");
        JTextField ended = new JTextField(10);
        Checkbox checkboxEnded = new Checkbox("Густая");

        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();

        ImageIcon icon = new ImageIcon(Objects.requireNonNull(getClass().getResource("paint.jpg")));
        frame.setIconImage(icon.getImage());
        frame.setBounds(dimension.width / 2 - 300, dimension.height / 2 - 200, 500, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        endedPanel.add(endedCount);
        endedPanel.add(ended);
        endedPanel.add(checkboxEnded);
        panel.add(currentCount);
        panel.add(really);
        panel.add(checkbox);
        panel.add(calculation);
        frame.add(panel, "North");
        frame.add(calculation, "South");
        frame.add(endedPanel);
        frame.setVisible(true);
        return frame;
    }
}
