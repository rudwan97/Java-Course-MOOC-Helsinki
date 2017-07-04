package simplecalculator.applicationlogic;

import simplecalculator.applicationlogic.Calculator;

public class PersonalCalculator implements Calculator {
    private int value;

    public PersonalCalculator() {
        this.value = 0;
    }

    @Override
    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public int giveValue() {
        return this.value;
    }

    @Override
    public void increase(int plusValue) {
        value += plusValue;
    }

    @Override
    public void decrease(int minusValue) {
        value -= minusValue;
    }
}
