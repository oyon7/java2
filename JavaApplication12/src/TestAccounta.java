
public class TestAccounta {

    public static void printBalance(CheckingAccount a) {
        System.out.println("Account Balance: " + a.getBalance());
    }

    public static void main(String[] args) {
        printBalance(new CheckingAccount());
        printBalance(new CheckingAccount(100.00));
        printBalance(new CheckingAccount(200.00));
    }
}
