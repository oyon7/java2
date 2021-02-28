
public class Cat {

    public String color = "White";
    public String action = "sitting";
    public int n = 0;
    public String newcolor;

    public Cat() {
        n = 1;
    }

    public Cat(String color) {
        this.color = color;
        n = 2;
    }

    public Cat(String color, String action) {
        this.color = color;
        this.action = action;
        n = 3;
    }

    public void changeColor(String color) {
        if (this.color != "White") {
            n = 9;
            newcolor = color;
        } else {
            n = 1;
            this.color = color;
        }

    }

    public void printCat() {
        if (n == 1) {
            System.out.println(color + " cat is " + action);
        }
        if (n == 2) {
            System.out.println(color + " cat is " + action);
        }
        if (n == 3) {
            System.out.println(action + " cat is " + color);
        }
        if (n == 9) {
            System.out.println(newcolor+ " cat is " +color);
        }

    }
}
