package karasik.learning.spring5webapp.spring_framework_course.domain.repositories;

import karasik.learning.spring5webapp.spring_framework_course.domain.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author,Long> {


}
