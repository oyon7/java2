    import java.util.Scanner;
    public class Assignment1_8 {
        public static void main(String []args){
            Scanner sc= new Scanner(System.in);
            int arr[]= new int [10];
            System.out.println("Enter number");
            for(int i=0; i<arr.length; ++i){
                int tmp=sc.nextInt();
                int occ=0;
                for(int j=0; j<i; ++j){
                    if(tmp==arr[j]){
                        ++occ;

                    }
                }
                if (occ == 4) {
                    System.out.printf("The number was entered 4 times already");
                                    --i;
                            } else {
                                    arr[i] = tmp;
                            }
                    }
                    int []cnt = new int[10];
                    for (int i=0;i<arr.length;++i) {
                            cnt[ arr[i] ]++;
                    }

                    for (int i=0;i<10;++i) {
                            if (cnt[i]>=2 && cnt[i]<5) {
                                    System.out.println("The numbers are "+i);
                            }
                    }
        }

    }
