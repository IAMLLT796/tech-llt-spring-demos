package tech.llt.springframework.dao;

import org.springframework.stereotype.Repository;
import tech.llt.springframework.entity.User;

import java.util.Collections;
import java.util.List;

/**
 * DAO获取POJO
 */
@Repository
public class UserDaoImpl {
    /**
     * 初始化
     */
    public UserDaoImpl(){

    }
    public List<User> findUserList(){
        return Collections.singletonList(new User("llt",18));
    }
}
