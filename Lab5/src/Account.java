
class Account {

    static double interestRate = 5.0;
    String s;
    double b;

    public Account() {
        s = "Default Account";
        b = 0.0;
    }
    
    public Account(String name, double balance){
        s= name;
        b= balance;
    }
    int num;

    public String nameKi() {
        return s;
    }

    public double balanceKi() {
        return b;
    }

    public void nameBoshao(String name) {
        s = name;
    }

    public void balanceBoshao(double a) {
        b = a;
    }
    
    public void withdraw(int taka){
         double rem= b-taka;
         if (rem<=100){
             System.out.print("The account balance after deducting withdraw amount is equal to or less than minimum. Cannot withdraw");
         }else{
             System.out.print("Withdraw successful! New balance is: "+rem);
         }
      
    }
    
}
