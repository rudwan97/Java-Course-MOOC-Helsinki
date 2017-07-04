package clicker.ui;

import clicker.applicationlogic.Calculator;

import java.awt.*;
import javax.swing.*;

public class UserInterface implements Runnable {
    private JFrame frame;
    private Calculator calculator;

    public UserInterface(Calculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public void run() {
        frame = new JFrame("Click Effect");
        frame.setPreferredSize(new Dimension(200, 100));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        GridLayout gridLayout = new GridLayout(2,1);
        container.setLayout(gridLayout);

        JLabel numberOfClicks = new JLabel("0");
        JButton clickButton = new JButton("Click!");
        ClickListener clickListener = new ClickListener(calculator, numberOfClicks);
        clickButton.addActionListener(clickListener);

        container.add(numberOfClicks);
        container.add(clickButton);
    }

    public JFrame getFrame() {
        return frame;
    }
}
