import javax.swing.*;
import java.awt.*;
import java.util.Objects;

public class Frame extends JFrame {

    JFrame frame;
    JPanel panel;
    JPanel endedPanel;
    JLabel currentCount;
    JTextField really;
    Checkbox checkbox;
    JButton calculation;
    JLabel endedCount;
    JTextField ended;
    Checkbox checkboxEnded;

    Frame() {
        frame = new JFrame("Расчёт объёма");
        panel = new JPanel();
        endedPanel = new JPanel();
        currentCount = new JLabel("Текущее количество эмали");
        really = new JTextField(10);
        checkbox = new Checkbox("Густая");
        calculation = new JButton("Рассчитать");
        calculation.setBackground(Color.CYAN);
        endedCount = new JLabel("Требуемое количество эмали");
        ended = new JTextField(10);
        checkboxEnded = new Checkbox("Густая");

        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();

        ImageIcon icon = new ImageIcon(Objects.requireNonNull(getClass().getResource("paint.jpg")));
        frame.setIconImage(icon.getImage());
        frame.setBounds(dimension.width / 2 - 300, dimension.height / 2 - 200, 500, 150);
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
        frame.pack();
        frame.setVisible(true);
        Engine engine = new Engine();
        calculation.addActionListener(engine);
    }
}
