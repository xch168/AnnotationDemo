package com.github.xch168.bindview.api;

import android.app.Activity;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by XuCanHui on 2018/9/2.
 */
public class BindViewTool {

    /**
     * 通过翻车找到对应的ViewBinding类，然后调用其中的bind方法，完成View的绑定
     * @param activity
     */
    public static void bind(Activity activity) {
        Class clz = activity.getClass();
        try {
            Class bindViewClass = Class.forName(clz.getName() + "_ViewBinding");
            Method method = bindViewClass.getMethod("bind", activity.getClass());
            method.invoke(bindViewClass.newInstance(), activity);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
