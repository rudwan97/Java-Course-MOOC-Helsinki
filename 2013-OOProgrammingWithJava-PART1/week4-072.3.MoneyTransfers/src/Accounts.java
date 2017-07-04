
public class Accounts {

    public static void main(String[] args) {
        // Code in Account.Java should not be touched!
        // write your code here
        Account a = new Account("A", 100.00);
        Account b = new Account("B", 0);
        Account c = new Account("C", 0);

        transfer(a, b, 50.00);
        transfer(b, c, 25.00);
    }

    public static void transfer(Account from, Account to, double howmuch) {
        from.withdrawal(howmuch);
        to.deposit(howmuch);

    }


}
