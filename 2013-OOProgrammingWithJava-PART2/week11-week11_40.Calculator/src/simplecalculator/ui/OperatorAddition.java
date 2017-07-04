package simplecalculator.ui;

import simplecalculator.applicationlogic.Calculator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OperatorAddition implements ActionListener {

    private Calculator calculator;
    private JTextField inputField;
    private JTextField outputField;
    private JButton clearButton;

    public OperatorAddition(Calculator calculator, JTextField inputField, JTextField outputField, JButton clearButton) {
        this.calculator = calculator;
        this.inputField = inputField;
        this.outputField = outputField;
        this.clearButton = clearButton;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            int number = Integer.parseInt(inputField.getText());
            this.calculator.increase(number);
            this.outputField.setText(String.valueOf(calculator.giveValue()));
            this.inputField.setText("");
        }catch (NumberFormatException ex) {
            this.inputField.setText("");
        }
        clearButton.setEnabled(true);
    }
}
