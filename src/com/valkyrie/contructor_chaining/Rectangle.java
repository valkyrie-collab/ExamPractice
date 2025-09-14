package com.valkyrie.contructor_chaining;

public class Rectangle {
    private final int length;
    private final int breath;
    private final int width;

    public Rectangle(int length, int breath, int width) {
        this.length = length;
        this.breath = breath;
        this.width = width;
    }

    public Rectangle(int length, int breath) {
        this(length, breath, 30);
    }

    public Rectangle(int length) {
        this(length, 20, 30);
    }

    public void getArea() {
        System.out.printf("The area of the %s is: %d\n", this.getClass().getSimpleName(), length * breath);
    }

    protected void getVolume() {
        System.out.printf("The volume of the %s is: %d\n", this.getClass().getSimpleName(), length * breath * width);
    }
}