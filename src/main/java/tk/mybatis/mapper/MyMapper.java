package tk.mybatis.mapper;

import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * @Description
 * @Author Bin
 * @Date 2019/4/8 16:06
 **/
@Repository
public interface MyMapper<T> extends Mapper<T>, MySqlMapper<T> {
}
