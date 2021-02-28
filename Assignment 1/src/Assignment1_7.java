import java.util.Scanner;
public class Assignment1_7 {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
         int[] a;
         a= new int[11];
         System.out.println("Enter number");
         for(int i=0; i<a.length; ++i){
             int t=sc.nextInt();
            int occ=0;
            for(int j=0; j<i; ++j){
                if(t==a[j]){
                    ++occ;
                }
            }
            if(occ==4){
                System.out.println("The number was entered 4 times already");
                --i;
                continue;
            }
            a[i]=t;
        
         } 
    }
}    

