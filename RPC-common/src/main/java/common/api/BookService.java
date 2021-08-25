package common.api;

import common.entity.Book;

import java.util.List;

/**
 * @Classname BookService
 * @Description TODO
 * @Date 2021/8/24 15:49
 * @Created by ASUS
 */
public interface BookService {
    /**
     *
     * @return 所有的书籍信息
     */
    List<Book> getAllBooks();
}
