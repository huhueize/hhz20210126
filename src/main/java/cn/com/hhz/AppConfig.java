package cn.com.hhz;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("cn.com.hhz")
public class AppConfig {



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
