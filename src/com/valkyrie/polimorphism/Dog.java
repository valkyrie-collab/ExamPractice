package com.valkyrie.polimorphism;

public class Dog extends Animal {

    @Override
    public void walking() {super.walking();}

    @Override
    public void sound() {super.sound("bark bark");}

    @Override 
    public void numberOfLegs() {super.numberOfLegs();}

}
