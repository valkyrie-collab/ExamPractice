package com.valkyrie.polimorphism;

public class Cat extends Animal {

    @Override
    public void walking() {super.walking();}

    @Override
    public void sound() {super.sound("Meow Meow");}

    @Override 
    public void numberOfLegs() {super.numberOfLegs();}
}
