package com.thinkingInJava.chapter10;

interface Jim1{
    default void jim(){
        System.out.println("Jim1::jim");
    }
}

interface Jim2{
    default void jim(){
        System.out.println("Jim2::jim");
    }
}
public class Jim implements Jim1,Jim2{
    @Override
    public void jim(){
        System.out.println("11");
    }

    public static void main(String[] args) {
        Jim2 jim2 = new Jim();
        jim2.jim();
    }
}
