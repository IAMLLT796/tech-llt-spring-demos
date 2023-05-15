package tech.llt.springframework;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import tech.llt.springframework.config.BeansConfig;
import tech.llt.springframework.entity.User;
import tech.llt.springframework.service.UserServiceImpl;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App
        /**
         * 主要接口
         */
{
    public static void main( String[] args )
    {
        /**
        //创建以及构建beans
        ApplicationContext context=new ClassPathXmlApplicationContext("aspects.xml","dao.xml","services.xml");

        //检索配置的实例
        UserServiceImpl service=context.getBean("userService",UserServiceImpl.class);

        //使用配置实例
        List<User> userList=service.findUserList();

        //从beans输出信息
        userList.forEach(a-> System.out.println(a.getName()+","+a.getAge()));
         */

        /**
        //加载BeansConfig的配置
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(BeansConfig.class);

        UserServiceImpl service=context.getBean("userService",UserServiceImpl.class);

        List<User> userList=service.findUserList();

        userList.forEach(a-> System.out.println(a.getName()+","+a.getAge()));
         */

        //在App中扫描tech.llt.springframework包
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext("tech.llt.springframework");

        UserServiceImpl service=context.getBean(UserServiceImpl.class);
        List<User> userList=service.findUserList();
        userList.forEach(a->System.out.println(a.getName()+","+a.getAge()));
        
    }
}
