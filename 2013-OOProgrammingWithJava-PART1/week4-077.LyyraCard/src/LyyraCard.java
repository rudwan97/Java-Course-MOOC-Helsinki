/**
 * Created by Jeannette on 21/04/2017.
 */
public class LyyraCard {

    private double balance;

    public LyyraCard(double balanceAtStart) {
        this.balance = balanceAtStart;
    }

    public String toString() {
        return "The card has " + balance + " euros";
    }

    public void payEconomical() {
        if (this.balance >= 2.5) {
            this.balance = this.balance - 2.5;
        }
    }

    public void payGourmet() {
        if (this.balance >= 4.0) {
            this.balance = this.balance - 4.0;
        }
    }

    public void loadMoney(double amount) {
        if (this.balance + amount > 150) {
            this.balance = 150;
        }
        else if (amount > 0) {
            this.balance = this.balance + amount;
        }
    }
}
