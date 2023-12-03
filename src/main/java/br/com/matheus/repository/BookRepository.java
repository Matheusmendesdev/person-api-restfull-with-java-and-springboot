package br.com.matheus.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.matheus.model.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
}
