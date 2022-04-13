package telran.java41.book.dao;

import java.util.stream.Stream;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import telran.java41.book.model.Book;
import telran.java41.book.model.Publisher;

public interface BookRepository extends JpaRepository<Book, Long> {

	Stream<Book> findByAuthorsName(String name);
	
	void deleteByAuthorsName(String authorName);

	Stream<Book> findByPublisherPublisherName(String publisherName);
	
}
