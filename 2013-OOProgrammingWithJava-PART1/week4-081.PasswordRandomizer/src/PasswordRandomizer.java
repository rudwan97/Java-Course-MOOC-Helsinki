import java.util.Random;

public class PasswordRandomizer {
    // Define the variables
    private int passwordLength;
    private Random password;

    public PasswordRandomizer(int length) {
        // Initialize the variable
        this.passwordLength = length;
        this.password = new Random();
    }

    public String createPassword() {
        // write code that returns a randomized password
        String pass = "";
        //char letterPosition = "abcdefghijklmnopqrstuvwxyz".charAt(password.nextInt(26));
        int i = 0;
        while (i < this.passwordLength) {
            pass += "abcdefghijklmnopqrstuvwxyz".charAt(password.nextInt(26));
            i++;
            }
        return "" + pass;
        }
    }
