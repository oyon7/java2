import java.util.Scanner;
public class Assignment1_9{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a[]=new int[10];
        for(int x=0;x<a.length;x++){
            a[x]=sc.nextInt();
        }
        System.out.println("Enter 1 for sorting odd position, 2 for even position and 3 for all");
        int choice=sc.nextInt();
        int p;
        int z;
        if(choice==1){
            p=0;z=2;
        }else if (choice==2 ){
            p=1;z=2;
        }else{
            p=0;z=1; 
        }
        for(int i=p;i<10;i=i+z){
            int maxloc=i;
            for(int v=i;v<10;v++){
                if(a[v]>a[maxloc]){
                    maxloc=v;
                }
            }
            int temp = a[i];
            a[i]=a[maxloc];
            a[maxloc]=temp;   
        }
        for(int x=0;x<10;x++){
            System.out.println(a[x]);
        }  
    }
}