package survey;

import java.awt.Container;
import java.awt.Dimension;
import javax.swing.*;

public class UserInterface implements Runnable {

    private JFrame frame;

    @Override
    public void run() {
        frame = new JFrame("Survey");
        frame.setPreferredSize(new Dimension(200, 300));

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(frame.getContentPane());
        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        BoxLayout boxLayout = new BoxLayout(container, BoxLayout.Y_AXIS);
        container.setLayout(boxLayout);

        JLabel label1 = new JLabel("Are you?");
        JCheckBox checkBoxYes = new JCheckBox("Yes!");
        JCheckBox checkBoxNo = new JCheckBox("No!");

        JLabel label2 = new JLabel("Why?");
        JRadioButton radioButton1 = new JRadioButton("No reason.");
        JRadioButton radioButton2 = new JRadioButton("Because it is fun!");
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(radioButton1);
        buttonGroup.add(radioButton2);

        JButton button = new JButton("Done!");

        container.add(label1);
        container.add(checkBoxYes);
        container.add(checkBoxNo);
        container.add(label2);
        container.add(radioButton1);
        container.add(radioButton2);
        container.add(button);

    }


    public JFrame getFrame() {
        return frame;
    }
}
