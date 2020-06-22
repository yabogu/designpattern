package com.example.designpattern.factorypattern;

public class FactoryPatternDemo {

    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        //获取circle对象
        Shape circle = shapeFactory.getShape("CIRCLE");
        circle.draw();
        //获取
    }
}
