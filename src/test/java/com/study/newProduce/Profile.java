package com.study.newProduce;

/**
 * Created by Edward on 2016/3/18.
 */
class Profile{
    private String classname;
    private String male;
    private Integer age;

    static {
        System.out.println("Profile static block ");
    }
    Profile(){
        System.out.println("Profile Constructor ： no parameters");
    }

    Profile(String classname,String male, Integer age) {
        this.classname=classname;
        this.male = male;
        this.age = age;
        System.out.println("Profile Constructor ： ( from "+classname+" )");
    }
}
