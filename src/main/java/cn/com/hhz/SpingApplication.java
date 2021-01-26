package cn.com.hhz;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpingApplication {
    public static void main(String[] args) {
        ApplicationContext context =new AnnotationConfigApplicationContext("cn.com.hhz");
        for(String beanName:context.getBeanDefinitionNames()){
            System.out.println(beanName);
        }
        UserService userService = context.getBean(UserService.class);
        userService.save();
    }
}
