
import java.util.Scanner;

public class MyString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string");
        String s = sc.next();
        Task1 a = new Task1(s);
        System.out.println(a.length());
        System.out.println("Enter n");
        int n = sc.nextInt();
        a.charAt(n);
        System.out.println("Enter another string");
       String s2 = sc.next();
        System.out.println(a.startsWith(s2));
        System.out.println("Enter another string");
        String s3 = sc.next();
        System.out.println(a.startsWith(s3));
    }
}
