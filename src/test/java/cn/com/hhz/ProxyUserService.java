package cn.com.hhz;

import java.util.Date;

public class ProxyUserService implements UserService{

    private UserService userService;

    public ProxyUserService(UserService userService){
        this.userService = userService;

    }

    @Override
    public void save() {
        Date start = new Date();
        userService.save();
        Date end = new Date();
        System.out.println("执行时间"+(end.getTime()-start.getTime()));

    }

    @Override
    public void update() {
        Date start = new Date();
        userService.save();
        Date end = new Date();
        System.out.println("执行时间"+(end.getTime()-start.getTime()));
    }
}
