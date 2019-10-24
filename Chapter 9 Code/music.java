package com.thinkingInJava.nine;

enum Note{
    MIDDLE_C,C_SHARP,B_FLAT;
}

class Instrument{
    public void play(Note n){
        System.out.println("Instrument.play()" + n);
    }
    String what(){
        return "Instrument";
    }

    void adjust(){
        System.out.println("Adjusting Instrument");
    }
}

class Wind extends Instrument{
    @Override
    public void play(Note n) {
        System.out.println("Wind.play() " + n);
    }

    @Override
    String what() {
        return "Wind";
    }

    @Override
    void adjust() {
        System.out.println("Adjusting Wind");
    }
}

class Stringed extends Instrument{
    @Override
    public void play(Note n) {
        System.out.println("Stringed.play() " + n);
    }

    @Override
    String what() {
        return "Stringed";
    }

    @Override
    void adjust() {
        System.out.println("Adjusting Stringed");
    }
}
class Percussion extends Instrument{
    @Override
    public void play(Note n) {
        System.out.println("Percussion.play() " + n);
    }

    @Override
    String what() {
        return "Percussion";
    }

    @Override
    void adjust() {
        System.out.println("Adjusting Percussion");
    }
}

class Brass extends Wind{
    @Override
    public void play(Note n) {
        System.out.println("Brass.play() " + n);
    }

    @Override
    void adjust() {
        System.out.println("Adjusting Brass");
    }
}

class WoodWind extends Wind{
    @Override
    public void play(Note n) {
        System.out.println("WoodWind.play() " + n);
    }

    @Override
    String what() {
        return "WoodWind";
    }

}

public class music {
    public static void tune(Instrument i){
        i.play(Note.MIDDLE_C);
    }

    public static void tune2(Instrument i){
        i.play(Note.MIDDLE_C);
    }

    public static void tuneAll(Instrument[] instruments){
        for (Instrument instrument : instruments) {
            tune(instrument);
        }
    }

    public static void main(String[] args) {
        Instrument[] orchestra = {
                new Wind(),
                new Percussion(),
                new WoodWind(),
                new Stringed(),
                new Brass(),
                new Instrument()
        };
        tuneAll(orchestra);
    }
}
