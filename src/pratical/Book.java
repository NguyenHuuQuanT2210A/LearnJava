package pratical;

public class Book {
    private String title;
    private Author author;
    private double price;

    public Book() {
    }

    public Book(String title, Author author, double price) {
        this.title = title;
        this.price = price;
        this.author = author;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Title: "+title +"\nAuthor: "+author+"\nPrice: "+price;
    }
}
