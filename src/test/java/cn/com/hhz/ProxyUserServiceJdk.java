package cn.com.hhz;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Date;

public class ProxyUserServiceJdk implements InvocationHandler {

    public Object target;

    ProxyUserServiceJdk(Object target){
        this.target=target;

    }

    public Object getProxy(){
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),target.getClass().getInterfaces(),this);
    }

    @Override
    public Object invoke(Object o, Method method, Object[] args) throws Throwable {
        Date start = new Date();
        Object result = method.invoke(target,args);
        Date end = new Date();
        System.out.println("执行时间"+(end.getTime()-start.getTime()));
        return null;
    }
}
