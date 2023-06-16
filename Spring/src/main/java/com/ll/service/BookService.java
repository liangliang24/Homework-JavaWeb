package com.ll.service;

import com.ll.domain.Book;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface BookService
{
    //保存
    public boolean save(Book book);
    //修改
    public boolean update(Book book);
    //删除
    public boolean delete(Integer id);
    //按照id查询
    public Book getById(Integer id);
    //查询全部
    public List<Book> getAll();
}
