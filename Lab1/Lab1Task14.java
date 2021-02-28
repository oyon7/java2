import java.util.Scanner;
public class Lab1Task14{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        for(int row=1; row<=a; ++row){
            for(int spc=1; spc<=a-row; ++spc)
                System.out.print(" ");
            for(int i=1; i<=row; ++i)
                System.out.print(i);
            for(int i=row-1; i>=1; --i)
                System.out.print(i);
            System.out.println();
        }
    }
}