import java.util.Scanner;
public class Assignment1_3 {
    public static void main (String [] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter numbers");
        int[] a = new int[10];
        for(int i=0; i<a.length; ++i)
            a[i]=sc.nextInt();
        for(int i=0; i<a.length; ++i){
            int maxloc=i;
            for(int j=i+1; j<a.length; ++j){
                if(a[maxloc]<a[j])
                    maxloc=j;
            }               
            int temp=a[maxloc];
            a[maxloc]=a[i];
            a[i]=temp;

        }
        for(int i=0; i<a.length; ++i)
           System.out.print(a[i]+" ");
            
    }  
}
