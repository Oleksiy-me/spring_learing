package karasik.learning.spring5webapp.spring_framework_course.domain.repositories;

import karasik.learning.spring5webapp.spring_framework_course.domain.domain.Author;
import karasik.learning.spring5webapp.spring_framework_course.domain.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book,Long> {


}
