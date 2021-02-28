
public class Task1 {

    private char[] c;
    private char[] d;
    private char[] e;
    private int num;
    boolean flag = true;

    public Task1() {

    }

    public Task1(String b) {
        c = b.toCharArray();
    }

    public int length() {
        return c.length;
    }

    public void charAt(int d) {
        if (d < c.length) {
            System.out.println(c[d]);
        } else {
            System.out.println("Invalid Index");

        }
    }

    public boolean startsWith(String r) {
        d = r.toCharArray();
        for (int i = 0; i < d.length; ++i) {
            if (c[i] != d[i]) {
                flag = false;
            }
        }
        return flag;
    }

    public boolean endsWith(String r) {
        flag = true;
        e = r.toCharArray();
        for (int i = c.length - e.length, j = 0; j < e.length; i++, j++) {
            if (c[i] != e[j]) {
                flag = false;
            }

        }
        return flag;
    }

    public void replaceFirst(char a, char b) {
        for (int i = 0; i < c.length; i++) {
            if (c[i] == a) {
                c[i] = b;
                break;
            }
        }

    }

    public void print() {
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i]);
        }
        System.out.println();
    }

    public void replaceAll(char a, char b) {
        for (int i = 0; i < c.length; i++) {
            if (c[i] == a) {
                c[i] = b;

            }
        }

    }

    public void replaceLast(char a, char b) {
        for (int i = c.length - 1; i >= 0; i--) {
            if (c[i] == a) {
                c[i] = b;
                break;
            }
        }

    }

    public void toLowerCase() {
        for (int i = 0; i < c.length; i++) {
            if (c[i] >= 65 && c[i] <= 90) {
                c[i] = (char) (c[i] + 32);

            }
        }
    }

    public void toUpperCase() {
        for (int i = 0; i < c.length; i++) {
            if (c[i] >= 97 && c[i] <= 122) {
                c[i] = (char) (c[i] - 32);

            }
        }
    }

    public boolean equals(String g) {
        d = g.toCharArray();
        if (d.length == c.length) {
            for (int i = 0; i < d.length; i++) {
                if (d[i] != c[i]) {
                    flag = false;
                    break;
                }
            }
        } else {
            flag = false;
        }
        return flag;
    }

}
