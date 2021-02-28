
import java.util.Scanner;

public class As3Task12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first name an last name");
        Author alpha = new Author(sc.nextLine(), sc.nextLine());
        alpha.toString();
    }

}

class Author {

    String firstName;
    String lastName;

    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String toString() {
        System.out.println(firstName);
        System.out.println(lastName);
        return null;
    }

}
