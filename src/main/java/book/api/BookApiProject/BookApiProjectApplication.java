package book.api.BookApiProject;

import book.api.BookApiProject.entity.Author;
import book.api.BookApiProject.entity.AuthorRepository;
import book.api.BookApiProject.entity.Book;
import book.api.BookApiProject.entity.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RequiredArgsConstructor
public class BookApiProjectApplication implements CommandLineRunner {

	private final BookRepository bookRepo;
	private final AuthorRepository authRepo;

	public static void main(String[] args) {

		SpringApplication.run(BookApiProjectApplication.class, args);

		}
	@Override
	public void run(String... args) throws Exception {
//		Author jerryWilliams = new Author("Jerry", "Williams", 38);
//		authRepo.save(jerryWilliams);
//		Book newBook = new Book("Gotham City", jerryWilliams, 2000, 250.00);
//		bookRepo.save(newBook);
	}

}
