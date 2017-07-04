
public class CashRegister {

    private double cashInRegister;
    private int economicalSold;
    private int gourmetSold;

    public CashRegister() {
        // at start the register has 1000 euros
        this.cashInRegister = 1000;
        this.economicalSold = 0;
        this.gourmetSold = 0;
    }

    public double payEconomical(double cashGiven) {

        double ecoLunch = 2.5;
        if (cashGiven >= ecoLunch) {
            cashInRegister += ecoLunch;
            this.economicalSold++;
            return cashGiven - ecoLunch;
        }
        return cashGiven;
    }

    public double payGourmet(double cashGiven) {

        double gourmetLunch = 4;
        if (cashGiven >= gourmetLunch) {
            cashInRegister += gourmetLunch;
            this.gourmetSold++;
            return cashGiven - gourmetLunch;
        }
        return cashGiven;
    }

    public boolean payEconomical(LyyraCard card) {
        double ecoLunch = 2.5;
        if (card.balance() >= ecoLunch) {
            card.pay(ecoLunch);
            this.economicalSold++;
            return true;
        }
        return false;
    }

    public boolean payGourmet(LyyraCard card) {
        double gourmetLunch = 4;
        if (card.balance() >= gourmetLunch) {
            card.pay(gourmetLunch);
            this.gourmetSold++;
            return true;
        }
        return false;
    }

    public void loadMoneyToCard(LyyraCard card, double sum) {
        if (sum > 0) {
            card.loadMoney(sum);
            this.cashInRegister += sum;
        }
    }

    public String toString() {
        return "money in register " + cashInRegister + " economical lunches sold: " + economicalSold + " gourmet lunches sold: " + gourmetSold;
    }
}