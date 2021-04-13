package com.example.BookStore.service;

import javax.security.auth.login.LoginException;

public class UserService {
    private UserDao dao= new UserDao();
    //注册操作
    public void register(User user)throws RegisterException{
        //调用dao完成注册操作
        try{dao.addUser(user);
          //发送激活邮件
            String emailMsg="感谢您注册网上书城，单击"+"<a href='http://127.0.0"

        }
    }
    //登录操作
    public User login(String username, String password) throws LoginException{
        try {

        }catch (){

        }
    }
}
