package com.study.newProduce;

/**
 * Created by Edward on 2016/3/18.
 */
public class Dog extends  Animal{

    private String name;
    static {
        System.out.println("Dog static block ");
    }
    private static Profile profile=new Profile("Dog","1",10);

    public Dog(){
        System.out.println("Dog Constructor: no parameters");
    }

    public Dog(String name){
        this.name=name;
        System.out.println("Dog Constructor: existing parameters");
    }

    public  void walk(){
        System.out.println("Dog class method :walk.");
    }

    public static void   dosomething(){
        System.out.println("Dog static method : dosomething.");
    }


    public static void main(String args[]){
       Dog dog=new Dog();//<1>
       Dog.dosomething();//<2>

//        单独执行<1>,console输出：
//        Animal static block
//        Profile static block
//        Profile Constructor ： ( from Animal )
//        Dog static block
//        Profile Constructor ： ( from Dog )
//        Animal Constructor: no parameters
//        Dog Constructor: no parameters

//        单独执行<2>,console输出：
//        Animal static block
//        Profile static block
//        Profile Constructor ： ( from Animal )
//        Dog static block
//        Profile Constructor ： ( from Dog )
//        Dog static method : dosomething.

//        同时执行<1>和<2>,console输出：
//        Animal static block
//        Profile static block
//        Profile Constructor ： ( from Animal )
//        Dog static block
//        Profile Constructor ： ( from Dog )
//        Animal Constructor: no parameters
//        Dog Constructor: no parameters
//        Dog static method : dosomething.
    }
}
