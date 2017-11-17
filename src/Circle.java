//60172981 김건우
//Shape에서 inherit한 method를 구현, 결과 값을 return

public class Circle extends Shape implements Drawable{
	private double x, y, radius;
    double pi = Math.PI;
 
    public Circle(double i, double j, double k) {
    	x = i;
    	y = j;
        radius = k;
    }

    public double getArea() {
        return pi * Math.pow(radius, 2);
    }

    public double getLength() {
        return 2 * pi * radius;
    }
	
	public void draw() {
		System.out.println("Circle center(" + x + ", " + y + ")-radius(" + radius + ")");
	}
}