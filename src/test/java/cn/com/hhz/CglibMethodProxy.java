package cn.com.hhz;

import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;
import java.util.Date;

public class CglibMethodProxy implements MethodInterceptor {

    @Override
    public Object intercept(Object target, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        Date start = new Date();
        methodProxy.invokeSuper(target,args);
        Date end = new Date();
        System.out.println("执行时间"+(end.getTime()-start.getTime()));
        return null;
    }
}
