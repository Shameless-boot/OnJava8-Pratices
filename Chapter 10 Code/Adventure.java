package com.thinkingInJava.chapter10;

interface canFight{
    void fight();
}
interface canSwim{
    void swim();
}
interface canFly{
    void fly();
}

class ActionCharacter{
    public void fight(){
        System.out.println("ha");
    }
}

class Hero extends ActionCharacter implements canFight, canFly, canSwim{

    @Override
    public void swim() {

    }

    @Override
    public void fly() {

    }
}
public class Adventure {
    public static void t(canFight x){
        x.fight();
    }
    public static void u(canSwim x){
        x.swim();
    }
    public static void v(canFly x){
        x.fly();
    }
    public static void w(ActionCharacter x){
        x.fight();
    }

    public static void main(String[] args) {
        Hero h = new Hero();
        t(h);
        u(h);
        v(h);
        w(h);
    }
}
