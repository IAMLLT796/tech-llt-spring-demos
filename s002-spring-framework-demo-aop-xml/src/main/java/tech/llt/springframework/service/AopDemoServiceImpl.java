package tech.llt.springframework.service;

/**
 * @Author llt
 * @Date 2023-05-15-22:55
 **/
public class AopDemoServiceImpl {
    public void doMethod1(){
        System.out.println("AopDemoServiceImpl.doMethod1()");
    }

    public String doMethod2(){
        System.out.println("AopDemoServiceImpl.doMethod2()");
        return "hello world";
    }

    public String doMethod3() throws Exception{
        System.out.println("AopDemoServiceImpl.doMethod3()");
        throw new Exception("some exception");
    }
}
