package com.valkyrie.composition;

class Cuboid extends Rectangle {
    
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

class Rectangle {
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

public class AreaAndVolumeOfCuboid {

    public static void initialize(int length, int breath, int width) {
        Rectangle areaOne = new Rectangle(length, breath, width);
        areaOne.getArea();

        Rectangle areaTwo = new Cuboid(length, breath, width);
        areaTwo.getArea();
        areaTwo.getVolume();
    }
}
