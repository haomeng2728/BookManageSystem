package com.dao;

import com.entity.Book;
import org.apache.ibatis.annotations.Param;
import java.util.List;

public interface BookDao {
    /**
     * 通过ID查询单本图书
     * @param id
     * @return
     */
    Book queryById(long id);

    /**
     * @param offset
     * @param limit
     * @return
     */
    List<Book> queryAll(@Param("offset") int offset, @Param("limit") int limit);

    /**
     * 减少馆藏数量
     * @param  bookId
     * @return 如果行数>=1,表示更新的记录行数
     */
    int reduceNumber(long bookId);


}
