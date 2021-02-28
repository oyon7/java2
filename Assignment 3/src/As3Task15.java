
import java.util.Scanner;

public class As3Task15 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BoroInt a = new BoroInt();
        
        a.TestString(sc.next());
        System.out.println(a.val);
    }
}

class BoroInt {

    String val;
    boolean v;
    int d;

    public BoroInt() {
        val = "0";
    }

    public void TestString(String a) {
         val=a ;
    }

    public boolean validValue(String val) {
        v = true;
        return true;
    }

    public void Printcheck() {
        if (v != true) {
            System.out.println("BorointErModdheNumberCharaARKisuDeyaJayNaException");
        }
    }

    public String trim(String val) {
        return val;

    }

    public String TakeInt(int d) {
        return this.val = Integer.toString(d);
    }

}
