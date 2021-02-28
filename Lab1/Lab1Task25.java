import java.util.Scanner;
public class Lab1Task25{
    public static void main (String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        for(int row=1; row<=num; row++){
            for(int spc=1; spc<=num-row; spc++){
                System.out.print(" ");
            }
            for(int col=1; col<=2*row-1; col++){
                if(col==1||col==2*row-1){
                    System.out.print('*');
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for(int row=1; row<=num-1; row++){
            for(int spc=1; spc<=row; spc++){
                System.out.print(" ");
            }
            for(int col=1; col<=2*num-2*row-1; col++){
                if(col==1||col==2*num-2*row-1){
                    System.out.print('*');
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        
    }
}