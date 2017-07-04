public class Main {
    public static void main(String[] args) {
        // write testcode here
        Counter counterNone = new Counter();
        Counter counterBoolean = new Counter(false);
        Counter counterStarting = new Counter(2);
        Counter counterBothTrue = new Counter(2, true);
        Counter counterBothFalse = new Counter(1, false);

        counterBothTrue.decrease();
        System.out.println("Both true: " + counterBothTrue.value());;
        counterBothTrue.decrease();
        counterBothTrue.decrease(5);
        counterBothTrue.decrease();
        counterBothTrue.decrease();
        System.out.println("Both true: " + counterBothTrue.value());

        counterNone.decrease();
        System.out.println("None: " + counterNone.value());

        counterBoolean.decrease();
        System.out.println("Boolean: " + counterBoolean.value());

        counterStarting.increase();
        counterStarting.decrease();
        counterStarting.decrease();
        counterStarting.decrease();
        counterStarting.decrease();
        System.out.println("Starting: " + counterStarting.value());

        counterBothFalse.decrease();
        counterBothFalse.decrease();
        System.out.println("Both False: " + counterBothFalse.value());



    }
}
