package com.example.BookStore.utils;

import sun.jvm.hotspot.debugger.AddressException;

import java.util.Properties;

public class MailUtils {
    public static void sendMail(String email,String emailMsg)
        throws AddressException,MessagingException{
        //1.1创建Properties对象，并设置邮件服务器的基本信息
        Properties props = new Properties();
    }
}
