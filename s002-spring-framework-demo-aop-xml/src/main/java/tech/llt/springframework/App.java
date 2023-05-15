package tech.llt.springframework;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import tech.llt.springframework.service.AopDemoServiceImpl;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //创建和配置bean
        ApplicationContext context=new ClassPathXmlApplicationContext(("aspect.xml"));

        //检索配置实例
        AopDemoServiceImpl service=context.getBean("demoService",AopDemoServiceImpl.class);

        //使用配置实例
        service.doMethod1();
        service.doMethod2();

        try {
            service.doMethod3();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
