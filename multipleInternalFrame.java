import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;

public class multipleInternalFrame extends JFrame {

    public multipleInternalFrame() {

        setSize(400, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Multiple Internal Frames");

        JDesktopPane desktopPane = new JDesktopPane();

        // 1st internal frame

        JInternalFrame frame1 = new JInternalFrame("Student Form", true, true, true, true);
        frame1.setSize(100, 100);
        frame1.setLocation(20, 20);
        frame1.add(new JLabel("Student Information"));
        frame1.setVisible(true);

        // 2nd internal frame
        JInternalFrame frame2 = new JInternalFrame("Teacher Form", true, true, true, true);
        frame2.setSize(100, 100);
        frame2.setLocation(200, 250);
        frame2.add(new JLabel("Teacher Information"));
        frame2.setVisible(true);

        JInternalFrame frame3 = new JInternalFrame("Result Form",  true, true, true, true);
        frame3.setSize(200, 150);
        frame3.setLocation(120, 200);
        frame3.add(new JLabel("Student Result"));
        frame3.setVisible(true);

        //adding frame to desktopplane
        desktopPane.add(frame1);
        desktopPane.add(frame2);
        desktopPane.add(frame3);

        //ading panel to frame
        add(desktopPane);
        setVisible(true);
    }

    public static void main(String[] args) {
        new multipleInternalFrame();
    }

}
