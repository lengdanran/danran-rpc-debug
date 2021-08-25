package consumer.controller;

import common.api.BookService;
import common.entity.Book;
import danran.rpc.annotation.InjectService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Classname ConsumerController
 * @Description TODO
 * @Date 2021/8/24 19:04
 * @Created by ASUS
 */
@RestController
@RequestMapping("/consumer")
public class ConsumerController {

    @InjectService
    private BookService bookService;

    @GetMapping("/get_all_books")
    public List<Book> getAllBooks() {
        return bookService.getAllBooks();
    }
}
