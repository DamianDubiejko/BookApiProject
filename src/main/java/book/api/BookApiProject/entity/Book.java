package book.api.BookApiProject.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long bookId;
    private String title;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "author")
    private Author author;
    private int year;
    private double price;
    private double rating;
//    public Book(String title, Author author, int year, double price) {
//        this.title = title;
//        this.author = author;
//        this.year = year;
//        this.price = price;
//    }
}
