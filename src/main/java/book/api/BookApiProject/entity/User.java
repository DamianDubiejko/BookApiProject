package book.api.BookApiProject.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table( name = "_user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long userId;
    private String first_name;
    private String last_name;
    private String email;
    private String password;
    private int age;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "rating")
    @JsonIgnore
    private List<Book> rated_books;
}
