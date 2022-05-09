import shapes.* ;
import mypack.converter.*;

public class PackageDemo {
    public static void main(String[] args) {
        System.out.println("Circle:");
		Circle c = new Circle(2.5f);
		System.out.println(c.getArea());
		System.out.println(c.getPerimeter());
		
		System.out.println("Square:");
		Square s = new Square(4.6f);
		System.out.println(s.getArea());
		System.out.println(s.getPerimeter());
		
		System.out.println("Triangle:");
		Triangle t= new Triangle(4.5f,1.9f,3.0f,3.2f);
		System.out.println(t.getArea());
		System.out.println(t.getPerimeter());

		System.out.println("KM to miles: " + DistanceConverter.kmToMiles(3.5));
		System.out.println("Seconds to minutes: " + TimeConverter.secToMin(45));
    }
}
