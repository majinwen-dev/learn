package com.example.learn.learn.domain;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Author: 马金文
 * @Date: 2021/10/13 14:38
 * @Description:
 */
@Scope("prototype")
@Component
public class User {

    private String userId;

    private String userName;

    private int age;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
//        if (o == null || getClass() != o.getClass()) {
//            return false;
//        }

        if (o instanceof User) {
            User user = (User) o;
            return userId.equals(user.userId);
        }
        return false;
    }

//    @Override
//    public int hashCode() {
//        return userId.hashCode();
//    }

//    @Override
//    public String toString() {
//        return "User{" +
//                "userId='" + userId + '\'' +
//                ", userName='" + userName + '\'' +
//                ", age=" + age +
//                '}';
//    }

    public static void main(String[] args) throws UnknownHostException {

        InetAddress inetAddress = InetAddress.getLocalHost();
        String ip = inetAddress.getHostAddress();

        System.out.println(ip);
        List<User> users = new ArrayList<>();

        users.add(new User() {{
            setUserName("张三1");
        }});
        users.add(new User() {{
            setUserName("张三1");
        }});
        users.add(new User() {{
            setUserName("张三2");
        }});
        users.add(new User() {{
            setUserName("张三2");
        }});
        users.add(new User() {{
            setUserName("张三3");
        }});
        users.add(new User() {{
            setUserName("张三3");
        }});
        users.add(new User() {{
            setUserName("张三4");
        }});
        // 去重
        // List<User> collect = users.stream().distinct().collect(Collectors.toList());

        // 同名的设置相同id


        for (User user : users) {
            System.out.println(user);
        }
    }
}
