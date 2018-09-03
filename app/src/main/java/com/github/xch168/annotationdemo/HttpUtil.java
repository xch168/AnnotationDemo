package com.github.xch168.annotationdemo;

import android.util.Log;

import java.lang.reflect.Method;

/**
 * Created by XuCanHui on 2018/8/26.
 */
public class HttpUtil {


    @Request(host = "https://api.github.com/", path = "users", method = Request.GET)
    public void request1() {

    }

    @Request(host = "https://api.github.com/", path = "users/xch168/repos", method = Request.POST, version = 2)
    public void request2() {

    }


    public static void main(String[] args) {
        try {
            Class clz = Class.forName("com.github.xch168.annotationdemo.HttpUtil");
            for (Method method : clz.getMethods()) {
                if (method.isAnnotationPresent(Request.class)) {
                    Request request = method.getAnnotation(Request.class);

                    System.out.println("method name:" + method.getName());
                    System.out.println("request host:" + request.host());
                    System.out.println("request path:" + request.path());
                    System.out.println("request method:" + request.method());
                    System.out.println("request version:" + request.version());
                    System.out.println("-----------------");
                }
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
