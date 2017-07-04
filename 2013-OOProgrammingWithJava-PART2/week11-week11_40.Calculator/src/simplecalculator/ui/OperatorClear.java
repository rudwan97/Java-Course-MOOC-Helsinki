package simplecalculator.ui;

import simplecalculator.applicationlogic.Calculator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OperatorClear implements ActionListener {
    private Calculator calculator;
    private JTextField intputField;
    private JTextField outputField;
    private JButton clearButton;

    public OperatorClear(Calculator calculator, JTextField inputField, JTextField outputField, JButton clearButton) {
        this.calculator = calculator;
        this.intputField = inputField;
        this.outputField = outputField;
        this.clearButton = clearButton;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
            this.calculator.setValue(0);
            this.outputField.setText("0");
            this.intputField.setText("");
            clearButton.setEnabled(false);



    }
}
