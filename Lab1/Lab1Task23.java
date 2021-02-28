import java.util.Scanner;
public class Lab1Task23{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter number");
        int num= sc.nextInt(); 
        for(int rowC=1; rowC<= num; rowC++){
            for(int spaceC=num ; spaceC>rowC; spaceC--){
                System.out.print(" ");
            }
            for(int i=num-rowC+1; i<=num; i++){
                if(rowC==num|| i==num|| rowC==num-i+1)
                    System.out.print('*');
                else
                     System.out.print(" ");
            }
            System.out.println();
        }
    }
}