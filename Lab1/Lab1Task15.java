import java.util.Scanner;
public class Lab1Task15{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter number");
        int num= sc.nextInt();
        for( int n=1; n<=num; n++){
            System.out.print('*');
        }
        System.out.println();
    }
}