package com.study.newProduce;

/**
 * Created by Edward on 2016/3/18.
 */
public class Animal {

    private String name;
    static {
        System.out.println("Animal static block ");
    }
    private static Profile profile=new Profile("Animal","1",10);

    public Animal(){
        System.out.println("Animal Constructor: no parameters");
    }
    public Animal(String name){
        this.name=name;
        System.out.println("Animal Constructor: existing parameters");
    }

    public  void walk(){
        System.out.println("Animal class method :walk.");
    }

    public static void   dosomething(){
        System.out.println("Animal static method : dosomething.");
    }


    public static void main(String args[]){

//        Animal static block
//        Profile static block
//        Profile Constructor ： ( from Animal )
//        Animal Constructor: no parameters
          Animal animal=new Animal();

//        Animal static block
//        Profile static block
//        Profile Constructor ： ( from Animal )
//        Animal static method : dosomething.

//        Animal static block
//        Profile static block
//        Profile Constructor ： ( from Animal )
//        Animal Constructor: no parameters
//        Animal static method : dosomething.
        Animal.dosomething();
    }
}

