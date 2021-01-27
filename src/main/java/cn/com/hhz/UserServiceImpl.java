package cn.com.hhz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
@Scope("prototype")
public class UserServiceImpl implements UserService{

    @Autowired
    private UserDao userDao;

    public void save(){
//        userDao.save();
        System.out.println("service save");
    }

    @Override
    public void update() {
        System.out.println("service update");
    }
}
