abstract class Shape{
	protected String color;
	
	public Shape(){
		color = "red";
	}
	
	public Shape(String color){
		this.color = color;
	}
	
	public String getColor(){
		return color;
	}
	
	public void setColor(String color){
		this.color = color;
	}

	abstract public float getArea();
	abstract public float getPerimeter();

}

interface Shapes{
	public float getArea();
	public float getPerimeter();
}

class Circle extends Shape{
	protected float radius;
	
	public Circle(){
		radius = 1.0f;
	}
	
	public Circle(float radius){
		this.radius = radius;
	}
	
	public Circle(float radius, String color){
		super(color);
		this.radius = radius;
	}
	
	public float getRadius(){
		return radius;
	}
	
	public void setRadius(float radius){
		this.radius = radius;
	}
	
	public float getArea(){
		return (float) (3.14 * radius * radius);
	}
	
	public float getPerimeter(){
		return (float) (2 * 3.14 * radius);
	}
}

class Rectangle extends Shape{
	protected float width;
	protected float length;
	
	public Rectangle(){
		
		width = 1.0f;
		length = 1.0f;
	}
	
	public Rectangle(float width, float length){
		this.width = width;
		this.length = length;
	}
	
	public Rectangle(float width, float length,String color){
		super(color);
		this.width = width;
		this.length = length;
	}
	
	public float getWidth(){
		return width;
	}
	
	public void setWidth(float width){
		this.width = width;
	}
	
	public float getLength(){
		return length;
	}
	
	public void setLength(float length){
		this.length = length;
	}
	
	public float getArea(){
		return (float) (length * width);
	}
	
	public float getPerimeter(){
		return (float) (2 * length * width);
	}
}

class Square extends Rectangle{
	public Square(){
		super();
	}
	
	public Square(float side){
		super.length = side;
		super.width = side;
	}
	
	public Square(float side, String color){
		super(side, side, color);
		super.length = side;
		super.width = side;
	}
	
	public float getSide(){
		return super.length;
	}
	
	public void setSide(float side){
		super.length = side;
		super.width = side;
	}
	
	public float getArea(){
		return (float) (super.length * super.length);
	}
	
	public float getPerimeter(){
		return (float) (4 * super.length);
	}
}

public class TestAbstract{
	public static void main(String []args){
		Shape []s = new Shape[3];
		
		System.out.println("Circle:");
		s[0] = new Circle(2.5f,"Blue");
		System.out.println(s[0].getArea());
		System.out.println(s[0].getPerimeter());
		System.out.println(s[0].getColor());
		
		System.out.println("Rectangle:");
		s[1] = new Rectangle(4.6f,7.8f);
		System.out.println(s[1].getArea());
		System.out.println(s[1].getPerimeter());
		System.out.println(s[1].getColor());
		
		System.out.println("Square:");
		s[2] = new Square(4.5f,"Orange");
		System.out.println(s[2].getArea());
		System.out.println(s[2].getPerimeter());
		System.out.println(s[2].getColor());
		
	}	
}
