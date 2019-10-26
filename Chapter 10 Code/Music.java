package com.thinkingInJava.chapter10;

enum Note{
    MIDDLE_C,C_SHARP,B_FLAT;
}
interface Instrument{

    int VALUE = 5;  //自动隐含的声明为 static final
    default void play(Note n){
        System.out.println(this + ".play() " + n);
    }
    default void adjust(){
        System.out.println("Adjusting " + this);
    }
}
class Wind implements Instrument{
    @Override
    public String toString() {
        return "Wind";
    }
}

class Brass extends Wind{
    @Override
    public String toString() {
        return "Brass";
    }
}

class Percussion implements Instrument{
    @Override
    public String toString() {
        return "Percussion";
    }
}

class Stringed implements Instrument{
    @Override
    public String toString() {
        return "Stringed";
    }
}

class Woodwind extends Wind{
    @Override
    public String toString() {
        return "Woodwind";
    }
}

public class Music {
    static void tune(Instrument i){
        i.play(Note.MIDDLE_C);
    }

    static void tuneAll(Instrument... e){
        for (Instrument instrument : e) {
            instrument.play(Note.MIDDLE_C);
        }
    }

    public static void main(String[] args) {
        Instrument[] orchestra= {
                new Wind(),
                new Percussion(),
                new Stringed(),
                new Brass(),
                new Woodwind()
        };
        tuneAll(orchestra);
    }
}
