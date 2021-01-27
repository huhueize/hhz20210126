package cn.com.hhz;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

@Component
@Aspect
public class LogAspect {
    @Pointcut("@annotation(cn.com.hhz.Transaction)")
    public void pointCut(){
    }

    @Around("pointCut()")
    public void around(ProceedingJoinPoint joinPoint) throws Throwable {
        MethodSignature methodSignature = (MethodSignature)joinPoint.getSignature();
        Method method = methodSignature.getMethod();
        Transaction transaction = method.getAnnotation(Transaction.class);
        if(transaction!=null){
            System.out.println(transaction.propagate());
        }
        System.out.println("begin transaction");

//        System.out.println("ascpectj before");
//        joinPoint.proceed(joinPoint.getArgs());
//        System.out.println("ascpectj after");
    }

}
