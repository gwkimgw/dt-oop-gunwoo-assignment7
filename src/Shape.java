//60172981 김건우
//Drawable을 implement하고 Rectangle과 Shape가 inherit할 method를 정의

import java.io.*;

public abstract class Shape implements Drawable {

	public abstract double getArea();
	public abstract double getLength();
	
	public static void main(String[] args) {
        Shape rectangle1 = new Rectangle(10, 20, 30, 40);
        System.out.println("Area: " + rectangle1.getArea());
        System.out.println("Length: " + rectangle1.getLength());
        
        Shape rectangle2 = new Rectangle(30, 30, 10, 10);
        System.out.println("Area: " + rectangle2.getArea());
        System.out.println("Length: " + rectangle2.getLength());

        Shape circle = new Circle(50, 20, 30);
        System.out.println("Area: " + Math.round(circle.getArea()*10)/10.0);
        System.out.println("Length: " + Math.round(circle.getLength()*10)/10.0);
        
        Text t = new Text("Sample Text");
        rectangle1.draw();
        rectangle2.draw();
        circle.draw();
        t.draw();
	}
}
