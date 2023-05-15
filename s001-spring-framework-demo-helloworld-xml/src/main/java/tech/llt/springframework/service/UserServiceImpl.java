package tech.llt.springframework.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import tech.llt.springframework.dao.UserDaoImpl;
import tech.llt.springframework.entity.User;

import java.util.List;

/**
 * 调用Dao层
 */
@Service
public class UserServiceImpl {
    /**
     * user dao impl.
     */
    @Autowired
    @Qualifier("userDaoImpl")
    private UserDaoImpl userDao;
    /**
     * 初始化
     */
    public UserServiceImpl() {
    }

    /**
     * 查找用户列表
     * @return 用户列表
     */
    public List<User> findUserList(){
        return this.userDao.findUserList();
    }

    /**
     * set dao
     * @param userDao user dao
     */
    public void setUserDao(UserDaoImpl userDao)
    {
        this.userDao=userDao;
    }
}
