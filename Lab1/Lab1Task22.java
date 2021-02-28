import java.util.Scanner;
public class Lab1Task22{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter number");
        int num= sc.nextInt(); 
        for(int rowC=1; rowC<= num; rowC++){
            for(int colC=1; colC<= rowC; colC++){
                if(rowC==num||colC==rowC||colC==1){
                    System.out.print('*');
                }else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}