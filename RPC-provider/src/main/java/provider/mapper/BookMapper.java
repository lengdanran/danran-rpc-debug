package provider.mapper;

import common.entity.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Classname BookMapper
 * @Description TODO
 * @Date 2021/8/24 15:45
 * @Created by ASUS
 */
@Mapper
@Repository
public interface BookMapper {
    int deleteByPrimaryKey(Integer bookId);

    int insert(Book record);

    int insertSelective(Book record);

    Book selectByPrimaryKey(Integer bookId);

    int updateByPrimaryKeySelective(Book record);

    int updateByPrimaryKey(Book record);

    List<Book> getAllBooks();

    List<Book> getBorrowedBooks(@Param("id")String id);
}
