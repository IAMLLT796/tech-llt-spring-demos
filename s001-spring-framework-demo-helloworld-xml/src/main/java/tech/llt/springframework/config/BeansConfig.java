package tech.llt.springframework.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import tech.llt.springframework.aspect.LogAspect;
import tech.llt.springframework.dao.UserDaoImpl;
import tech.llt.springframework.service.UserServiceImpl;

@Configuration
@EnableAspectJAutoProxy
public class BeansConfig {
    /**
     * @return user dao
     */
    @Bean("userDao")
    public UserDaoImpl userDao(){
        return new UserDaoImpl();
    }

    /**
     * @return user service
     */
    @Bean("userService")
    public UserServiceImpl userService(){
        UserServiceImpl userService=new UserServiceImpl();
        userService.setUserDao(userDao());
        return userService;
    }

    @Bean("logAspect")
    public LogAspect logAspect(){
        return new LogAspect();
    }
}
