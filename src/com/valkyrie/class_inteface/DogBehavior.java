package com.valkyrie.class_inteface;

public class DogBehavior implements AnimalBehavoir {

    @Override
    public void walking() {
        System.out.println("The Animal is walking using its four legs");;
    }

    @Override
    public void sound() {
        System.out.println("The animal is barking and barking");;
    }

    @Override
    public void behavior() {
        System.out.println("The animal is very playful and friendly to the humans");;
    }

    @Override
    public String whatWeConclude() {
        return "The animal is a dog that whats we conclude; ";
    }

}
