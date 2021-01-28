package karasik.learning.spring5webapp.spring_framework_course.domain.bookstrap;

import karasik.learning.spring5webapp.spring_framework_course.domain.domain.Book;
import karasik.learning.spring5webapp.spring_framework_course.domain.domain.Publisher;
import karasik.learning.spring5webapp.spring_framework_course.domain.repositories.BookRepository;
import karasik.learning.spring5webapp.spring_framework_course.domain.repositories.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BookStrapData implements CommandLineRunner {

    private final PublisherRepository publisherRepository;
    private final BookRepository bookRepository;

    public BookStrapData(PublisherRepository publisherRepository, BookRepository bookRepository) {
        this.publisherRepository = publisherRepository;
        this.bookRepository = bookRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        //saving into h2 database

        System.out.println("Start in Bootstrap");
        Publisher publisher1 = new Publisher("Pablo", "Escabaro");
        Book book1 = new Book("Koks", "543");

        book1.setPublisher(publisher1);
        publisher1.getBooks().add(book1);

        publisherRepository.save(publisher1);
        bookRepository.save(book1);


        System.out.println("Number of books = " + publisherRepository.count());
    }
}
