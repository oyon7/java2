import java.util.Scanner;
public class Lab1Task16{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter row");
        int row= sc.nextInt();
        System.out.println("Please enter column");
        int col= sc.nextInt();
        for(int n=1; n<=row; n++){
            for(int i=1; i<=col; i++){
                System.out.print('*');
            }
            System.out.println();
        }
        
    }
}