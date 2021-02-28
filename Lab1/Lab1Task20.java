import java.util.Scanner;
public class Lab1Task20{
  public static void main (String [] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number");
    int num=sc.nextInt();
    for(int row=1; row<=num; row++){
      for(int space=1; space<=num-row; space++){
        System.out.print(" ");
      }
      for(int column=1; column<=2*row-1; column++){
        System.out.print("*");
      }
      System.out.println();
    }
    for(int row=1; row<=num-1; row++){
      for(int space=1; space<=row; space++){
        System.out.print(" ");
      }
      for(int column=1; column<=2*num -2*row-1; column++){
        System.out.print("*");
      }
      System.out.println();
    }
  }
}