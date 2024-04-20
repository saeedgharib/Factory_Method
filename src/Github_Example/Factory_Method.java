/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Github_Example;

import java.util.ArrayList;

/**
 *
 * @author malik
 */
public class Factory_Method {

   
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Shape> shapes = new ArrayList<>();
		
		CircleGeometry cricle= new CircleGeometry();
		SquareGeometry square = new SquareGeometry();
		TriangleGeometry triangle = new TriangleGeometry();
		shapes.add(cricle.createShape());
		shapes.add(square.createShape());
		shapes.add(triangle.createShape());
		
		for(Shape s:shapes){
			s.draw();
		}
    }
}
