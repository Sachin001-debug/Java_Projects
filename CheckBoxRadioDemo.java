 import javax.swing.*;
import java.awt.*;

public class CheckBoxRadioDemo extends JFrame {

    public CheckBoxRadioDemo() {
    
        setTitle("Checkbox & RadioButton Demo");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // CHECKBOX
        JLabel hobbyLabel = new JLabel("Select Hobbies:");

        JCheckBox music = new JCheckBox("Music");
        JCheckBox dance = new JCheckBox("Dance");
        JCheckBox sports = new JCheckBox("Sports");

        add(hobbyLabel);
        add(music);
        add(dance);
        add(sports);

        //RADIO BUTTON
        JLabel genderLabel = new JLabel("Select Gender:");

        JRadioButton male = new JRadioButton("Male");
        JRadioButton female = new JRadioButton("Female");
        JRadioButton other = new JRadioButton("Other");

        // Group radio buttons
        ButtonGroup bg = new ButtonGroup();
        bg.add(male);
        bg.add(female);
        bg.add(other);

        add(genderLabel);
        add(male);
        add(female);
        add(other);

        setVisible(true);
    }

    public static void main(String[] args) {
        new CheckBoxRadioDemo();
    }
} 
