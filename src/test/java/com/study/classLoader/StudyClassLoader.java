package com.study.classLoader;

import java.net.URL;
import java.net.URLClassLoader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by Edward on 2016/3/17.
 */
public class StudyClassLoader {

    public static void main(String args[]){
//        ExtensionClassLoader ec=new ExtensionClassLoader();
//        URLClassLoader ul=

        //启动类加载器
        //
        URL[] urls=sun.misc.Launcher.getBootstrapClassPath().getURLs();
        for (int i = 0; i < urls.length; i++) {
            System.out.println(urls[i].toExternalForm());
        }

        //扩展类加载器
        //负责加载JRE的扩展目录（可由java.ext.dirs系统属性指定，默认为JAVA_HOME/jre/lib/ext；）中JAR或类。
        System.out.println(System.getProperty("java.ext.dirs"));




        //系统类加载器
        //负责加载JRE的扩展目录（可由java.class.path系统属性制定）中的JAR或类。
        System.out.println(System.getProperty("java.class.path"));
        System.out.println(sun.misc.Launcher.getLauncher().getClassLoader());//sun.misc.Launcher$AppClassLoader@592fa617
        System.out.println(ClassLoader.getSystemClassLoader());//sun.misc.Launcher$AppClassLoader@592fa617
        System.out.println("the parent of app classloader : "+ClassLoader.getSystemClassLoader().getParent());//sun.misc.Launcher$ExtClassLoader@1471cb25


       try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/databasename", "username", "password");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }/*t*/


       //Thread.currentThread().setContextClassLoader();
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getContextClassLoader());
        //Dri
        //Class.forName("");
       // Thread.currentThread().getContextClassLoader().loadClass("");

    }
}
