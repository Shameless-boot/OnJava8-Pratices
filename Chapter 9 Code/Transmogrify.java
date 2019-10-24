package com.thinkingInJava.nine;

interface Actor{
    public void act();
}

class HappyActor implements Actor{
    @Override
    public void act() {
        System.out.println("HappyActor");
    }
}class SadActor implements Actor{
    @Override
    public void act() {
        System.out.println("SadActor");
    }
}
class Stage{
    private Actor actor = new HappyActor();
    public void change(){
        actor = new SadActor();
    }
    public void performPlay(){
        actor.act();
    }
}
public class Transmogrify {
    public static void main(String[] args) {
        Stage stage = new Stage();
        stage.performPlay();
        stage.change();
        stage.performPlay();
    }
}
