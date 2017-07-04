package simplecalculator.ui;

import simplecalculator.applicationlogic.Calculator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OperatorSubtraction implements ActionListener{

    private Calculator calculator;
    private JTextField inputField;
    private JTextField outputField;
    private JButton clearButton;

    public OperatorSubtraction(Calculator calculator, JTextField inputField, JTextField outputField, JButton clearButton) {
        this.calculator = calculator;
        this.inputField = inputField;
        this.outputField = outputField;
        this.clearButton = clearButton;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            int number = Integer.parseInt(inputField.getText());
            this.calculator.decrease(number);
            this.outputField.setText(String.valueOf(calculator.giveValue()));
            this.inputField.setText("");
        }catch (NumberFormatException ex) {
            this.inputField.setText("");
        }
        clearButton.setEnabled(true);
    }

}
