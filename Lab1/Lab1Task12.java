import java.util.Scanner;
public class Lab1Task12{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int row=num;row>=1;row--){
            for(int k=1; k<=row-1; ++k)
                System.out.print(" ");
            
            for(int column=row;column<=num;column++)
                System.out.print(column);
            
            System.out.println();
        }
    }
}