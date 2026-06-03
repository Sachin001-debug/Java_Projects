import javax.swing.*;
import java.awt.*;

public class button_color_eventlistener extends JFrame {

    public button_color_eventlistener() {

        setTitle("Button Colors");
        setSize(400, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JLabel titleLabel = new JLabel("Buttons & Colors", SwingConstants.CENTER);
        add(titleLabel, BorderLayout.NORTH);

        JPanel panel = new JPanel();

        JButton redBtn = new JButton("RED");
        JButton blueBtn = new JButton("BLUE");
        JButton greenBtn = new JButton("GREEN");

        panel.add(redBtn);
        panel.add(blueBtn);
        panel.add(greenBtn);

        add(panel, BorderLayout.CENTER);

        // Action Listeners
        redBtn.addActionListener(e -> {
            redBtn.setBackground(Color.RED);
        });

        blueBtn.addActionListener(e -> {
            blueBtn.setBackground(Color.BLUE);
        });

        greenBtn.addActionListener(e -> {
            greenBtn.setBackground(Color.GREEN);
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new button_color_eventlistener();
    }
}