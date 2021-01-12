package com.jk.service;

import com.jk.pojo.Book;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Janiak
 * @version 1.0
 * @date 2021/1/12
 * @description
 */
@Service
public interface BookService {
    int addBook(Book book);
    int deleteBookById(int id);
    int updateBook(Book book);
    int selectBookById(int id);
    List<Book> selectAllBooks();
}
