package clicker.applicationlogic;

public class PersonalCalculator implements Calculator {
    private int clicks;

    public PersonalCalculator() {
        this.clicks = 0;
    }

    @Override
    public int giveValue() {
        return clicks;
    }

    @Override
    public void increase() {
        clicks++;
    }
}
