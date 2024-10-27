package com.lvh.creational.prototype;

public class Demo {
    public static void main(String[] args) {
        ShapeCache.loadCache();

        Shape clonedCircle = ShapeCache.getShape("circle");
        clonedCircle.draw();

        Shape cloneRectangle = ShapeCache.getShape("rectangle");
        cloneRectangle.draw();
    }
}
