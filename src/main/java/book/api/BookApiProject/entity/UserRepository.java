package book.api.BookApiProject.entity;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository <User, Long> {
}
