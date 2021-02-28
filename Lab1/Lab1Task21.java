import java.util.Scanner;
public class Lab1Task21{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter row");
        int row= sc.nextInt();
        System.out.println("Please enter column");
        int col= sc.nextInt();
        for(int i=1; i<=row; i++){
            for(int j=1; j<=col; j++){
                if(i==1 || i== row || j==1 || j==col){
                    System.out.print('*');
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}



        
       