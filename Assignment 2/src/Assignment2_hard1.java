import java.util.Scanner;
class Assignment2_hard1{
  public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      String a;
      int sum=0;
      a=sc.next();
      for(int x=0;x<a.length();x++){
          sum+=((int)a.charAt(x)-'0');
      }
      
      
      if(sum%3==0){
          System.out.println(a+" is divisible by 3");
      }else{
          System.out.println(a+" is not divisible by 3");
      
      }
 
      
  }
}