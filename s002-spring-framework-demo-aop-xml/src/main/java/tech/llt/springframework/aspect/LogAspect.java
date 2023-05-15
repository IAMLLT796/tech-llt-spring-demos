package tech.llt.springframework.aspect;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * @Author llt
 * @Date 2023-05-15-22:59
 **/
public class LogAspect {

    /**
     * 环绕通知
     * @param pjp
     * @return
     * @throws Throwable
     */
    public Object doAround(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("--------------------");
        System.out.println("环绕通知：进入方法");
        Object o=pjp.proceed();
        System.out.println("环绕通知：推出方法");
        return o;
    }

    /**
     * 前置通知
     */
    public void doBefore(){
        System.out.println("前置通知");
    }

    /**
     * 后置通知
     * @param result
     */
    public void doAfterReturning(String result){
        System.out.println("后置通知"+result);
    }

    /**
     * 异常通知
     * @param e
     */
    public void doAfterThrowing(Exception e){
        System.out.println("异常通知，异常："+e.getMessage());
    }

    /**
     * 最终通知
     */
    public void doAfter(){
        System.out.println("最终通知");
    }
}
