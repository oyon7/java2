
import java.util.Scanner;

public class Assignment2_easy2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter word");
        String s = sc.nextLine();
        int a = s.length();
        //System.out.println(a);
        int[] b = new int[a];
        for (int i = 0; i < b.length; ++i) {
            if (s.charAt(i) == ' ') {
                b[i] = ' ';
                continue;
            }
            b[i] = s.charAt(i) + 1;

        }
        for (int i = 0; i < b.length; ++i) {
            System.out.print((char) b[i]);
        }
        System.out.println();

    }

}
