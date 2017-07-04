import simplecalculator.applicationlogic.Calculator;
import simplecalculator.applicationlogic.PersonalCalculator;
import simplecalculator.ui.GraphicCalculator;

import javax.swing.SwingUtilities;


public class Main {

    public static void main(String[] args) {

        Calculator calculator = new PersonalCalculator();
        SwingUtilities.invokeLater(new GraphicCalculator(calculator));
    }
}
