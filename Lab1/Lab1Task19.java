import java.util.Scanner;
public class Lab1Task19{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter number");
        int num= sc.nextInt();
        for(int i=1; i<=num; i++){
            for(int n=1; n<=num-i; n++){
                System.out.print(" ");
            }
            for(int r=1; r<=(2*i-1); r++){
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
