
class Account {

    int bal;

    public Account() {
        bal = 0;
    }

    public void add(int a) {
        bal += a;
        System.out.println("New balance is" + bal);
    }

    public void withdraw(int b) {
        bal -= b;
        System.out.println("New balance is" + bal);

    }

    public void inquire() {
        System.out.println("balance is" + bal);
    }

    public void check(int c) {
        if (c > bal) {
            bal -= 5;
            System.out.println("You have received penalty. New balance is" + bal);
        }
    }

    public void interest(int d) {
        bal += (d / 100);
        System.out.println("New balance is" + bal);
    }
}
