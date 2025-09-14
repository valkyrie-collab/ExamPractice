package com.valkyrie.contructor_chaining;

public class Cuboid extends Rectangle {
    
    public Cuboid(int length, int breath, int width) {
        super(length, breath, width);
    }

    public Cuboid(int length, int breath) {
        this(length, breath, 50);
    }

    public Cuboid(int length) {
        this(length, 70, 20);
    }

    @Override
    public void getVolume() {super.getVolume();}
}