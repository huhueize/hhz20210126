package cn.com.hhz;

import org.springframework.stereotype.Repository;

@Repository("userDao")
public class UserDao {
    public void save(){
        System.out.println("hello world!!");
    }
}
