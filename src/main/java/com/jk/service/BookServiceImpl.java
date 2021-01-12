package com.jk.service;

import com.jk.dao.BookMapper;
import com.jk.pojo.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Janiak
 * @version 1.0
 * @date 2021/1/12
 * @description
 */
@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookMapper bookMapper;
    public BookServiceImpl(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }
    @Override
    public int addBook(Book book) {
        return bookMapper.addBook(book);
    }

    @Override
    public int deleteBookById(int id) {
        return bookMapper.deleteBookById(id);
    }

    @Override
    public int updateBook(Book book) {
        return bookMapper.updateBook(book);
    }

    @Override
    public int selectBookById(int id) {
        return bookMapper.selectBookById(id);
    }

    @Override
    public List<Book> selectAllBooks() {
        return bookMapper.selectAllBooks();
    }

    public void setBookMapper(BookMapper bookMapper) {
            this.bookMapper = bookMapper;
    }
}
