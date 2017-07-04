package simplecalculator.ui;

import simplecalculator.applicationlogic.Calculator;

import java.awt.*;
import javax.swing.*;

public class GraphicCalculator implements Runnable {
    private Calculator calculator;
    private JFrame frame;

    public GraphicCalculator(Calculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public void run() {
        frame = new JFrame("Calculator");
        frame.setPreferredSize(new Dimension(400, 300));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        JTextField outputField = new JTextField("0");
        JTextField inputField = new JTextField();
        outputField.setEnabled(false);
        container.setLayout(new GridLayout(3, 1));

        JPanel panel = new JPanel(new GridLayout(1, 3));
        JButton plusButton = new JButton("+");
        JButton minusButton = new JButton("-");
        JButton clearButton = new JButton("Z");

        clearButton.setEnabled(false);

        plusButton.addActionListener(new OperatorAddition(calculator, inputField, outputField, clearButton));
        minusButton.addActionListener(new OperatorSubtraction(calculator, inputField, outputField, clearButton));
        clearButton.addActionListener(new OperatorClear(calculator, inputField, outputField, clearButton));

        panel.add(plusButton);
        panel.add(minusButton);
        panel.add(clearButton);

        container.add(outputField);
        container.add(inputField);
        container.add(panel);
    }

    public JFrame getFrame() {
        return frame;
    }
}