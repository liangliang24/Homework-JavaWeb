package com.ll.service.impl;

import com.ll.dao.BookDao;
import com.ll.domain.Book;
import com.ll.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService
{
    @Autowired
    private BookDao bookDao;

    public boolean save(Book book)
    {

        return bookDao.save(book) > 0;
    }

    public boolean update(Book book)
    {

        return bookDao.update(book) > 0;
    }

    public boolean delete(Integer id)
    {

        return bookDao.delete(id) > 0;
    }

    public Book getById(Integer id)
    {
        return bookDao.getById(id);
    }

    public List<Book> getAll()
    {
        return bookDao.getAll();
    }
}
