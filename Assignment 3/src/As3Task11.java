import java.util.Scanner;
public class As3Task11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input book, author and price");
        Book alpha= new Book(sc.nextLine(), sc.nextLine(), sc.nextDouble());
        alpha.toString();

    }

}

class Book {

    String title;
    String author;
    Double price;

    public Book(String title, String author, Double price) {
        this.title = title;
        this.author = author;
        this.price = price;

    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;

    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public Double getPrice() {
        return price;
    }

    public String toString() {
        System.out.println(title);
        System.out.println(author);
        System.out.println(price);
        return null;
    }
}
