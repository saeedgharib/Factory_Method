/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Single_FM_Implementation;

import java.util.ArrayList;

public class single_FM {

    public static void main(String[] args) {
        ArrayList<Shape> shapes = new ArrayList<>();
        
        shapes.add(ShapeFactory.createShape("circle"));
        shapes.add(ShapeFactory.createShape("square"));
        shapes.add(ShapeFactory.createShape("triangle"));
        
        for (Shape s : shapes) {
            s.draw();
        }
    }
}

class ShapeFactory {
    public static Shape createShape(String type) {
        switch (type.toLowerCase()) {
            case "circle" -> {
                return new Circle();
            }
            case "square" -> {
                return new Square();
            }
            case "triangle" -> { 
                return new Triangle();
            }
            default -> throw new IllegalArgumentException("Invalid shape type: " + type);
        }
    }
}

interface Shape {
    void draw();
}

class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Circle is drawn ⭕");
    }
}

class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Square is drawn ⏹️");
    }
}

class Triangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Triangle is drawn △");
    }
}
