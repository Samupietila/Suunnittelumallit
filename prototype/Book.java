package prototype;

public class Book implements Prototype {
    private String author;
    private String title;
    private String genre;
    private Integer publicationyear;
    public Book(String author, String title, String genre, Integer publicationyear) {
        this.author = author;
        this.title = title;
        this.genre = genre;
        this.publicationyear = publicationyear;
    }

    @Override
    public Book clone() {
        return new Book(this.author,this.title, this.genre, this.publicationyear);
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", genre='" + genre + '\'' +
                ", publicationyear=" + publicationyear +
                '}';
    }

}