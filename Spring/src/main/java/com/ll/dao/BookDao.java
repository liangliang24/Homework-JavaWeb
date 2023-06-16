package com.ll.dao;

import com.ll.domain.Book;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface BookDao
{
    @Insert("insert into tbl values(null,#{type},#{name},#{describe})")
    public Integer save(Book book);
    @Update("update tbl set type = #{type}, name = #{name}, `describe` = #{describe} where id = #{id}")
    public Integer update(Book book);
    @Delete("delete from tbl where id = #{id}")
    public Integer delete(Integer id);
    @Select("select * from tbl where id = #{id}")
    public Book getById(Integer id);
    @Select("select * from tbl")
    public List<Book> getAll();
}

