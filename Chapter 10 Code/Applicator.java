package com.thinkingInJava.chapter10;

import java.util.Arrays;

interface Processor{
    default String name(){
        return getClass().getSimpleName();
    }

    Object process(Object input);
}

class Upcase implements Processor{
    @Override
    public String process(Object input) {
        return ((String)input).toUpperCase();
    }
}

class DownCase implements Processor{
    @Override
    public String process(Object input) {
        return ((String) input).toLowerCase();
    }
}

class Splitter implements Processor{
    @Override
    public String process(Object input) {
        return Arrays.toString(((String) input).split(" "));
    }
}

public class Applicator {
    public static void apply(Processor p,Object s){
        System.out.println("Using Processor " + p.name());
        System.out.println(p.process(s));
    }
    public static void main(String[] args) {
        String s = "We are such staff as dreams are made on";
        apply(new Upcase(),s);
        apply(new DownCase(),s);
        apply(new Splitter(),s);
    }
}
