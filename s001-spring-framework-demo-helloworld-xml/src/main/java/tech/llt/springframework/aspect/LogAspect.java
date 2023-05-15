package tech.llt.springframework.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;

import java.lang.reflect.Method;

/**
 * 拦截所有service中的方法，并输出记录
 */
@Aspect
public class LogAspect {
    /**
     * 服务包下的每个方法的方面。
     * @param pjp
     * @return
     * @throws Throwable
     */
    @Around("execution(* tech.llt.springframework.service.*.*(..))")
    public Object businessService(ProceedingJoinPoint pjp) throws Throwable {
        Method method=((MethodSignature)(pjp.getSignature())).getMethod();
        System.out.println("execute method: "+method.getName());

        //继续执行
        return pjp.proceed();
    }
}
