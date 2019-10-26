package com.thinkingInJava.chapter10;

class Bing implements Operations{

    @Override
    public void execute() {
        System.out.println("Bing");
    }
}

class Crack implements Operations{

    @Override
    public void execute() {
        System.out.println("Crack");
    }
}

class Twist implements Operations{

    @Override
    public void execute() {
        System.out.println("Twist");
    }
}
public class Machine {
    public static void main(String[] args) {
        Operations.runOps(
                new Bing(), new Crack(), new Twist()
        );
    }
}
