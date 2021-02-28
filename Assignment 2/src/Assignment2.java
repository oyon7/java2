import java.util.Scanner;
class Assignment2_hard4{
  public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      String a;
      int f=sc.nextInt();
      a=sc.next();
      String res="";
      
      for(int x=0;x<a.length();x++){
          res+=(char)((int)a.charAt(x)+f);
          
      }
      System.out.print(res);
      
  }
}