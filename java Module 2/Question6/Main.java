class Author {
    String name;
    String email;
    char gender;

    Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return name + " (" + gender + "), Email: " + email;
    }
}

class Book {
    String title;
    double price;
    Author author;

    Book(String title, double price, Author author) {
        this.title = title;
        this.price = price;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book: " + title + "\n" +
               "Price: " + (int) price + "\n" +
               "Author: " + author;
    }
}

public class Main {
    public static void main(String[] args) {

        String input = "Effective Java,550,Joshua Bloch,jbloch@abc.com,M";

        String[] data = input.split(",");

        Author author = new Author(
            data[2],
            data[3],
            data[4].charAt(0)
        );

        Book book = new Book(
            data[0],
            Double.parseDouble(data[1]),
            author
        );

        System.out.println(book);
    }
}