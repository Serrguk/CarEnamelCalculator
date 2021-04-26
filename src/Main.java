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
        Checkbox checkbox = new Checkbox("Флажок");
        panel.add(checkbox);
        frame.add(panel);
        return frame;
    }
}
