package exam250523;

public class Book {
    String title;
    Author author;
    Double price;
    public Book(String title, Author author, Double price){
        this.title = title;
        this.author = author;
        this.price = price;
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

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String toString(){
        return ("NameBook: "+title+" Author: "+author+" Price: "+price);
    }
}
