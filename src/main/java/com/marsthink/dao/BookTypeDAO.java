package com.marsthink.dao;

import com.marsthink.bean.BookType;

import java.util.List;

public interface BookTypeDAO {
    /*
     * 获得所有图书类型
     */
    public List<BookType> getAllBookTypes();
}
