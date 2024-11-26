package prototype;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("J.K. Rowling", "Harry Potter and the Philosopher's Stone", "Fantasy", 1997);
        Book book2 = new Book("J.K. Rowling", "Harry Potter and the Chamber of Secrets", "Fantasy", 1998);
        Book book3 = new Book("J.K. Rowling", "Harry Potter and the Prisoner of Azkaban", "Fantasy", 1999);

        Recommendation recommendation = new Recommendation("Children");
        recommendation.addBook(book1);
        recommendation.addBook(book2);
        recommendation.addBook(book3);
        Recommendation clonedRecommendation = recommendation.clone();
        System.out.println(recommendation);
        System.out.println(clonedRecommendation);
        System.out.println(recommendation == clonedRecommendation);
    }
}