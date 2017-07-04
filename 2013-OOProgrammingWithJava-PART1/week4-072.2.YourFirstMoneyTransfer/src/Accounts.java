
public class Accounts {

    public static void main(String[] args) {
        // Code in Account.Java should not be touched!
        // write your code here
        Account mattsaccount = new Account("Matt's account", 1000.00);
        Account myaccount = new Account("My account", 0);

        mattsaccount.withdrawal(100.00);
        myaccount.deposit(100.00);

        System.out.println(mattsaccount);
        System.out.println(myaccount);
    }

}
