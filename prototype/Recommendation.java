package prototype;
import java.util.ArrayList;
import java.util.List;

public class Recommendation implements Prototype {
    private String targetAudience;
    private List<Book> bookList;

    public Recommendation(String targetAudience){
        this.targetAudience = targetAudience;
        this.bookList = new ArrayList<Book>();
    }

    public Recommendation(String targetAudience, List<Book> bookList) {
        this.targetAudience = targetAudience;
        this.bookList = bookList;
    }

    public void addBook(Book book){
        this.bookList.add(book);
    }

    public void removeBook(Book book){
        this.bookList.remove(book);
    }

    public String setTargetAudience (String targetAudience){
        return this.targetAudience = targetAudience;
    }

    @Override
    public Recommendation clone() {
        List<Book> clonedBookList = new ArrayList<Book>();
        for (Book book : this.bookList) {
            clonedBookList.add(book.clone());
        }
        return new Recommendation(this.targetAudience, clonedBookList);
    }

    @Override
    public String toString() {
        return "Recommendation{" +
                "targetAudience='" + targetAudience + '\'' +
                ", bookList=" + bookList +
                '}';
    }

}