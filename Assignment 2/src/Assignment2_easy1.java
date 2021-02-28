
import java.util.Scanner;

public class Assignment2_easy1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter word");
        String s = sc.next();
        int[] b = new int[s.length()];
        for (int i = 0; i < b.length; ++i) {
            b[i] = s.charAt(i);
        }
        for (int i = 0; i < b.length; ++i) {
            int min = b[i];
            int loc = i;
            for (int j = i + 1; j < b.length; ++j) {
                if (b[j] < min) {
                    min = b[j];
                    loc = j;
                }
            }
            int temp = b[i];
            b[i] = min;
            b[loc] = temp;

        }
        for (int i = 0; i < b.length; ++i) {
            System.out.print((char) b[i] + " ");
        }

    }

}
