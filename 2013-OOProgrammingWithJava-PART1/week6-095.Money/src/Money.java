
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    @Override
    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }
    public Money plus(Money added) {
        int newTotalEuros = this.euros + added.euros;
        int newTotalCents = this.cents + added.cents;
        return new Money(newTotalEuros, newTotalCents);
    }

    public boolean less(Money compared) {
        if (this.euros < compared.euros || (this.euros() == compared.euros() && this.cents() < compared.cents())) {
            return true;
        }
        return false;
    }

    public Money minus(Money compared) {

        if (less(compared)) {
            return new Money(0,0);
        }

        int newTotalEuros = this.euros() - compared.euros();
        int newTotalCents = 0;

        if (this.cents < compared.cents) {
            newTotalCents = this.cents + 100 - compared.cents;
            newTotalEuros--;
        }

        return new Money(newTotalEuros, newTotalCents);
    }

}
