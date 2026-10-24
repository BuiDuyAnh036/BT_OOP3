package Bai2.Bai2_2;

public class Testbook {
    public static void main(String[] args) {
        Author[] authors = new Author[2];
        authors[0] = new Author("Tan Ah Teck", "ahteck@nowhere.com", 'm');
        authors[1] = new Author("Paul Tan", "paul@nowhere.com", 'm');

        book b1 = new book("Java for Dummy", authors, 19.99, 99);
        System.out.println(b1);

        System.out.println("Author names are: " + b1.getAuthorNames());
    }
}