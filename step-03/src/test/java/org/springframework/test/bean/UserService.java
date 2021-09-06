package org.springframework.test.bean;

/**
 * @Author: Liushan
 * @Date: 2021/9/6 11:01
 */
public class UserService {
    String name;

    public UserService(String name) {
        this.name = name;
    }
    public void queryUserInfo(){
        System.out.println("查询用户信息: " + name);
    }

    @Override
    public String toString() {
        return "UserService{" +
                "name='" + name + '\'' +
                '}';
    }
}
