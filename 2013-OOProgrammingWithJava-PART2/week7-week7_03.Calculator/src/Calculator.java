import java.util.ArrayList;

/**
 * Created by Jeannette on 18/05/2017.
 */
public class Calculator {
    private Reader reader;
    private int calculations;

    public Calculator() {
        this.reader = new Reader();
        this.calculations = 0;
    }

    public void start() {
        while (true) {
            System.out.print("command: ");
            String command = reader.readString();
            if (command.equals("end")) {
                break;
            }

            if (command.equals("sum")) {
                sum();
            } else if (command.equals("difference")) {
                difference();
            } else if (command.equals("product")) {
                product();
            }
        }

        statistics();
    }

    private int[] valuesInput() {
        int[] values = new int[2];
        System.out.print("Value1:");
        values[0] = reader.readInteger();
        System.out.print("Value2:");
        values[1] = reader.readInteger();
        calculations++;
        return values;
    }

    private void sum() {
        int[] values = valuesInput();
        int sum = values[0] + values[1];
        System.out.println("sum of the values " + sum);
    }

    private void difference() {
        int[] values = valuesInput();
        int difference = values[0] - values[1];
        System.out.println("difference of the values " + difference);
    }

    private void product() {
        int[] values = valuesInput();
        int product = values[0] * values[1];
        System.out.println("product of the values " + product);
    }

    private void statistics() {
        System.out.println("Calculations done " + calculations);;
    }
}
