import java.util.Scanner;
public class Assignment1_4 {
    public static void main(String[] args){
         Scanner sc=new Scanner(System.in);
         int[] a;
         a = new int[5];
          System.out.println("Enter number");
         for(int i=0; i<a.length; ++i){
             a[i]=sc.nextInt();
             for(int v=0; v<=i; ++v){
                 if(a[i]==a[v]){
                     System.out.println("Enter number again");
                     --i;
                 }
             }
             System.out.println();
         }  
    }
}
    

    

