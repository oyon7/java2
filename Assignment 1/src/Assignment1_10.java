import java.util.Scanner;
public class Assignment1_10 {
    public static void main (String[] args){
		Scanner in = new Scanner(System.in);
 
		int []cnt = new int[10];
                System.out.println("Enter number");
		while(true) {
			int tmp = in.nextInt();
 
			cnt[tmp]++;
 
			int satisfy = 0;
                        
			for (int i=0;i<cnt.length;++i) {
				if (cnt[i]>=2 && cnt[i]<5) {
					satisfy++;
				}
			}
			if (satisfy==2) {
				break;
			}
		}
 
		for (int i=0;i<cnt.length;++i) {
			if (cnt[i]>=2 && cnt[i]<5) {
                            
				System.out.println("The numbers are "+i);
			}
		}
	}
}
    

