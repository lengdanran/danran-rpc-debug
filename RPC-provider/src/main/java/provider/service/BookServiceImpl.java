package provider.service;

import common.api.BookService;
import common.entity.Book;
import danran.rpc.annotation.RPCService;
import org.springframework.beans.factory.annotation.Autowired;
import provider.mapper.BookMapper;

import java.util.List;

/**
 * @Classname BookServiceImpl
 * @Description TODO
 * @Date 2021/8/24 15:50
 * @Created by ASUS
 */
@RPCService
public class BookServiceImpl implements BookService {

    @Autowired
    private BookMapper bookMapper;

    /**
     * @return 所有的书籍信息
     */
    @Override
    public List<Book> getAllBooks() {
        return bookMapper.getAllBooks();
    }
}
