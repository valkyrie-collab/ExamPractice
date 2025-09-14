package com.valkyrie.polimorphism;

public class Animal {

    public void walking() {
        System.out.println(this.getClass().getSimpleName() + " Walking");
    }

    public void sound() {
        System.out.println(this.getClass().getSimpleName() + " making sound");
    }

    protected void sound(String soundType) {
        System.out.println(this.getClass().getSimpleName() + " making " + soundType);
    }

    public void numberOfLegs() {
        System.out.println(this.getClass().getSimpleName() + " has 4 number of legs ");
    }

    protected void numberOfLegs(int number) {
        System.out.println(this.getClass().getSimpleName() + " has " + number + " has four number of Legs ");
    }
}
