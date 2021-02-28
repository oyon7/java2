
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
    public boolean equalsIgnoreCase(String g) {
        d = g.toCharArray();
        if (d.length == c.length) {
            for (int i = 0; i < d.length; i++) {
                if (d[i] != c[i]&&d[i]!=(char)(c[i]+32)&&d[i]!=(char)(c[i]-32)) {
                    flag = false;
                    break;
                }
            }
        } else {
            flag = false;
        }
        return flag;
    }
    
    int compareTo(String k){
        d=k.toCharArray();
        for (int i = 0; i < (c.length<d.length?c.length:d.length); i++) {
          if(c[i]!=d[i]){
             return c[i]-d[i];
           
          }
        }
        return 0;
        
    }
    int compareToIgnoreCase(String k){
        d=k.toCharArray();
        for (int i = 0; i < (c.length<d.length?c.length:d.length); i++) {
          if(c[i]!=d[i]&&c[i]-32!=d[i]&&c[i]+32!=d[i]){
             return c[i]-d[i];
           
          }
        }
        return 0;
    }
    
    String substring (int v){
        String f="";
        if(v>c.length-1) return null;
        for (int i = v; i < c.length; i++) {
          f+=c[i];
        }
        return f;
    }
    String substring (int a,int b){
        String f="";
        if(a<c.length-1&&b<c.length-1) return null;
        for (int i = a; i <=b; i++) {
          f+=c[i];
        }
        return f;
    }
    
    int indexOf(char ca){
        for (int i = 0; i < c.length; i++) {
          if(c[i]==ca){
              return i;
              
          }
        }
        return -1;
    }
    int lastIndexOf(char ca){
        for (int i = c.length-1; i >-1; i--) {
          if(c[i]==ca){
              return i;
              
          }
        }
        return -1;
    }
     int indexOf(char ca,int d){
        for (int i = d; i < c.length; i++) {
          if(c[i]==ca){
              return i;
              
          }
        }
        return -1;
    }
     int lastIndexOf(char ca,int d){
        for (int i = c.length-1; i >=d; i--) {
          if(c[i]==ca){
              return i;
              
          }
        }
        return -1;
    }
     
     void concat(String l){
         d=l.toCharArray();
         
         char [] p=new char[d.length+c.length];
         int x;
         for(x=0;x<c.length;x++)
           p[x]=c[x];
         for(int y=0;y<d.length;y++)
           p[y+x]=d[y];
         
         c=p;
     }
    

}
