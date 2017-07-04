package simplecalculator.applicationlogic;

public interface Calculator {
    int giveValue();
    void setValue(int value);
    void increase(int value);
    void decrease(int value);
}
