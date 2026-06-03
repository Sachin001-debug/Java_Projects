import javax.swing.*;
import java.awt.*;

public class calculatorLayout extends JFrame {

    public calculatorLayout() {

        setTitle("Calculator");
        setSize(400, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout(5, 5));

        // Display field
        JTextField display = new JTextField();
        display.setEditable(false);
        display.setFont(new Font("Arial", Font.PLAIN, 24));
        add(display, BorderLayout.NORTH);

        // Button panel
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 4, 5, 5));

        String[] buttons = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "0", "=", "C", "+"
        };

        for (String text : buttons) {
            panel.add(new JButton(text));
        }

        add(panel, BorderLayout.CENTER);

        setVisible(true);
    }
}