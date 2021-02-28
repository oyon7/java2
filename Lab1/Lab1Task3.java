import java.util.Scanner;
public class Lab1Task3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter number");
        int num= sc.nextInt();
        for(int i=1; i<=num; i++){
            for(int n=1; n<=i; n++){
                System.out.print(n);
            }
            System.out.println();
        }
    }
}
