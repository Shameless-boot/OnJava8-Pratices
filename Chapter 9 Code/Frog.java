package com.thinkingInJava.nine;

import com.alibaba.druid.sql.visitor.functions.Char;
import sun.security.krb5.internal.crypto.Des;

class Characteristic{
    private String s;

    public Characteristic(String s) {
        this.s = s;
        System.out.println("Creating Characteristic " + s);
    }
    protected void dispose(){
        System.out.println("disposing Characteristic " + s);
    }
}

class Description{
    private String s;

    public Description(String s) {
        this.s = s;
        System.out.println("Creating Description " + s);
    }

    protected void dispose(){
        System.out.println("disposing Description " + s);
    }
}

class LivingCreature{
    private Characteristic p = new Characteristic("is alive");
    private Description t = new Description("Basic Living Creature");

    public LivingCreature() {
        System.out.println("LivingCreature()");
    }

    protected void dispose(){
        System.out.println("LivingCreature dispose");
        t.dispose();
        p.dispose();
    }
}

class Animal extends LivingCreature{
    private Characteristic c = new Characteristic("has heart");
    private Description d = new Description("Animal not Vegetable");

    public Animal() {
        System.out.println("Animal()");
    }

    @Override
    protected void dispose() {
        System.out.println("Animal dispose");
        d.dispose();
        c.dispose();
        super.dispose();
    }
}
class Amphibian extends Animal{
    private Characteristic c = new Characteristic("can live in water");
    private Description d = new Description("Both water and land");

    public Amphibian() {
        System.out.println("Amphibian()");
    }

    @Override
    protected void dispose() {
        System.out.println("Amphibian dispose");
        d.dispose();
        c.dispose();
        super.dispose();
    }
}


public class Frog extends Amphibian{
    private Characteristic c = new Characteristic("Croaks");
    private Description d = new Description("Eats Bugs");

    public Frog() {
        System.out.println("Frog()");
    }

    @Override
    protected void dispose() {
        System.out.println("Frog dispose");
        d.dispose();
        c.dispose();
        super.dispose();
    }

    public static void main(String[] args) {
        Frog frog = new Frog();
        System.out.println("Bye!");
        frog.dispose();
    }
}
