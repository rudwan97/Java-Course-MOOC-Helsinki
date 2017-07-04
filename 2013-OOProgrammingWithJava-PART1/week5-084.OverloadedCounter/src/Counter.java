/**
 * Created by Jeannette on 07/05/2017.
 */
public class Counter {
    private int value;
    private boolean check;

    public Counter (int startingValue, boolean check) {
        this.value = startingValue;
        this.check = check;
    }

    public Counter (int startingValue) {
        this.value = startingValue;
    }

    public Counter (boolean check) {
        this(0, check);
    }

    public Counter () {
        this(0);
    }

    public int value() {
        return this.value;
    }

    public void increase() {
        this.value++;
    }

    public void decrease() {
        if (this.value > 0 || !this.check) {
            this.value--;
        }
    }

    public void increase(int increaseAmount) {
        if (increaseAmount > 0) {
            this.value += increaseAmount;
        }
    }

    public void decrease(int decreaseAmount) {
        if ((this.value() > decreaseAmount || !this.check) && decreaseAmount > 0) {
            this.value -= decreaseAmount;
        } else if ((decreaseAmount > this.value()) && decreaseAmount > 0) {
            this.value = 0;
        }
    }
}
