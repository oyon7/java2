
import java.util.Scanner;

public class Assignment1_8b {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] myArray = new int[256];
        String a;
        System.out.println("Enter number 0-9");
        for (int j = 0; j < 10; j++) {
            a = s.nextLine();
            for (int i = 0; i < a.length(); i++) {
                myArray[a.charAt(i)]++;
            }
        }
        System.out.println("The numbers are:");
        for (int i = 0; i < 256; i++) {
            if (myArray[i] >= 2) {
                if (myArray[i] < 5) {
                    System.out.println((char) i);
                }
            }
        }
    }

}
