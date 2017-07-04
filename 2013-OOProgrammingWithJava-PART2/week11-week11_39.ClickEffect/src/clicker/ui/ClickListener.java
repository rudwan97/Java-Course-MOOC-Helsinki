package clicker.ui;

import clicker.applicationlogic.Calculator;
import clicker.applicationlogic.PersonalCalculator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClickListener implements ActionListener {
    private JLabel label;
    private Calculator calculator;

    public ClickListener(Calculator calculator, JLabel label) {
        this.calculator = calculator;
        this.label = label;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        PersonalCalculator personalCalculator = new PersonalCalculator();
        this.calculator.increase();
        this.label.setText(String.valueOf(calculator.giveValue()));
    }
}
