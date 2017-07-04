package noticeboard;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.*;

public class NoticeBoard implements Runnable {

    private JFrame frame;

    @Override
    public void run() {
        frame = new JFrame();
        frame.setPreferredSize(new Dimension(500, 300));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        GridLayout gridLayout = new GridLayout(3, 1);

        frame.setLayout(gridLayout);

        JTextField textField = new JTextField("I was copied here from the JTextArea.");
        JButton button = new JButton("Copy!");
        JLabel label = new JLabel();

        AreaCopier areaCopier = new AreaCopier(textField, label);
        button.addActionListener(areaCopier);

        container.add(textField);
        container.add(button);
        container.add(label);
    }
}
