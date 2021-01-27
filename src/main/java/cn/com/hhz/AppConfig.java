package cn.com.hhz;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.ContextClosedEvent;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.util.CollectionUtils;

@Configuration
@ComponentScan("cn.com.hhz")
public class AppConfig {

    @EventListener
    public void refeshListner(ContextRefreshedEvent event){
        System.out.println(event.getTimestamp());
        ApplicationContext context=event.getApplicationContext();
        CollectionUtils.arrayToList(context.getBeanDefinitionNames()).forEach(item-> System.out.println(item));
    }



//    @Bean
//    public UserService userService(){
//        UserService userService =  new UserService();
//        userService.setUserDao(userDao());
//        return userService;
//    }
//    @Bean
//    public UserDao userDao(){
//        return  new UserDao();
//    }
//
//    @Bean
//    public User user(){
//        return new User(1,"hhz","男",21);
//    }


}
