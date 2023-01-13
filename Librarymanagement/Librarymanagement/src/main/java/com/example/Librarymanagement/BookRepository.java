package com.example.Librarymanagement;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import jakarta.transaction.Transactional;

public interface BookRepository extends JpaRepository<Book, Integer> {
	List<Book> findByGenre(@Param("genre") String genre);
	//List<Book> findByBookid(@Param("bookid") String bookid);
	@Transactional
    void deleteByBookid(@Param("bookid") String bookid);
	
}
