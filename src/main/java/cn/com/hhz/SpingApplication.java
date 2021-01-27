package cn.com.hhz;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpingApplication {
    public static void main(String[] args) {
        System.out.println(SingleTonUser.getInstance());
        AnnotationConfigApplicationContext context =new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);
        context.refresh();
//        for(String beanName:context.getBeanDefinitionNames()){
//            System.out.println(beanName);
//        }
//        CollectionUtils.arrayToList(context.getBeanDefinitionNames()).forEach(item-> System.out.println(item));
        UserServiceImpl userServiceImpl = context.getBean(UserServiceImpl.class);
        userServiceImpl.save();
    }
}
