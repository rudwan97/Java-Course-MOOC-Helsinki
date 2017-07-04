package simplecalculator.ui;

import simplecalculator.applicationlogic.Calculator;

import javax.swing.*;
import java.awt.*;

public class OperatorPanel extends JPanel {
    private Calculator calculator;

    public OperatorPanel(Calculator calculator) {
        super(new GridLayout(1, 3));
        this.calculator = calculator;
        createComponents();
    }

    public void createComponents() {
        JButton plusButton = new JButton("+");
        JButton minusButton = new JButton("-");
        JButton clearButton = new JButton("Z");



        add(plusButton);
        add(minusButton);
        add(clearButton);
    }

}
