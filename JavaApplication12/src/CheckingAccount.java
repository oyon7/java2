
public class CheckingAccount {
    double balance;
    public CheckingAccount(){
        balance=0;
        
    }
    public CheckingAccount(double d){
        balance=d;
        
    }
       public double getBalance(){
           return (int)balance;
       }        
    
}
