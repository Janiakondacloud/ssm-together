package com.jk.dao;

import com.jk.pojo.Book;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author Janiak
 * @version 1.0
 * @date 2021/1/12
 * @description
 */
public interface BookMapper {
    int addBook(Book book);
    int deleteBookById(@Param("bookId")int id);
    int updateBook(Book book);
    int selectBookById(@Param("bookId")int id);
    List<Book> selectAllBooks();
}
