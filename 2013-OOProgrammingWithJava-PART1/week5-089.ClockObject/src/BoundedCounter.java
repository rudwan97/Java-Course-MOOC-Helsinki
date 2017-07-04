public class BoundedCounter {
    private int value;
    private int upperLimit;

    public BoundedCounter(int upperLimit) {
        this.value = 0;
        this.upperLimit = upperLimit;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int time) {
        if (time < 0 || time > upperLimit) {
            this.value = 0;
        } else {
            this.value = time;
        }
    }

    public void next() {
        this.value++;
        if (this.value > upperLimit) {
            this.value = 0;
        }

    }

    public String toString() {
        if (this.value < 10) {
            return "0" + value;
        }
        return "" + value;
    }


}

