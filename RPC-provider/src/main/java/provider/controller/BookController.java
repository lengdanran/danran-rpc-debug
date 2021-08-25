package provider.controller;

import common.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import provider.mapper.BookMapper;

import java.util.List;

/**
 * @Classname BookController
 * @Description TODO
 * @Date 2021/8/24 15:51
 * @Created by ASUS
 */
@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    private BookMapper bookMapper;

    @GetMapping("/get_all_books")
    public List<Book> getAllBooks() {
        return bookMapper.getAllBooks();
    }
}
