package karasik.learning.spring5webapp.spring_framework_course.domain.repositories;

import karasik.learning.spring5webapp.spring_framework_course.domain.domain.Author;
import karasik.learning.spring5webapp.spring_framework_course.domain.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher,Long> {


}
