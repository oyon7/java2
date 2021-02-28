
import java.util.Scanner;

class Assignment2_hard2 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String a, b;

        a = sc.next();
        b = sc.next();

        int sum1 = 1;
        int sum2 = 1;

        for (int x = 0; x < a.length(); x++) {
            sum1 *= ((int) a.charAt(x) - 64);
        }
        for (int x = 0; x < b.length(); x++) {
            sum2 *= ((int) b.charAt(x) - 64);
        }
        if (sum1 % 14 < sum2 % 14) {
            System.out.print("I am happy with my coach");
        } else {
            System.out.print("I am sad with my coach");
        }

    }
}
