import java.util.Scanner;
public class Lab1Task10{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter number");
        int num= sc.nextInt();
        for(int line=1; line<=num; line++){
            for(int space=1; space<=num-line; space++){
                System.out.print(" ");
            }
            if(line==1||line==num){
                for(int j=1; j<=line*2-1; j++){
                    System.out.print(j);
                }
            }else{
                for(int j=1; j<=line*2-1; j++){
                    if(j==1||j==line*2-1)
                        System.out.print(j);
                    else
                        System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}