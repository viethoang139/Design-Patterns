package com.lvh.creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class ShapeCache {
    private static Map<String,Shape> shapeMap = new HashMap<>();

    public static Shape getShape(String shapeId){
        Shape cachedShape = shapeMap.get(shapeId);
        return (cachedShape != null) ? cachedShape.clone() : null;
    }

    public static void loadCache(){
        Circle circle = new Circle(5);
        shapeMap.put("circle", circle);

        Rectangle rectangle = new Rectangle(10,20);
        shapeMap.put("rectangle", rectangle);
    }


}
