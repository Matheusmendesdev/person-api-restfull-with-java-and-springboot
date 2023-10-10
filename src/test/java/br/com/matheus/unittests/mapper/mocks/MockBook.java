package br.com.matheus.unittests.mapper.mocks;

import br.com.matheus.data.vo.v1.BookVO;
import br.com.matheus.data.vo.v1.PersonVO;
import br.com.matheus.model.Book;
import br.com.matheus.model.Person;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MockBook {
    public Book mockEntity() {
        return mockEntity(0);
    }

    public BookVO mockVO() {
        return mockVO(0);
    }

    public List<Book> mockEntityList() {
        List<Book> books = new ArrayList<>();
        for (int i = 0; i < 14; i++) {
            books.add(mockEntity(i));
        }
        return books;
    }

    public List<BookVO> mockVOList() {
        List<BookVO> books = new ArrayList<>();
        for (int i = 0; i < 14; i++) {
            books.add(mockVO(i));
        }
        return books;
    }

    public Book mockEntity(Integer number) {
        Book book = new Book();
        book.setId(number.longValue());
        book.setAuthor("Author Test" + number);
        book.setLaunchDate(new Date());
        book.setPrice(25D);
        book.setTitle("Title Test" + number);
        return book;
    }

    public BookVO mockVO(Integer number) {
        BookVO book = new BookVO();
        book.setKey(number.longValue());
        book.setAuthor("Author Test" + number);
        book.setLaunchDate(new Date());
        book.setPrice(25D);
        book.setTitle("Title Test" + number);
        return book;
    }
}
