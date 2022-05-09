import java.lang.Math;

import org.w3c.dom.css.Rect;

class Shape{
    protected String color;

    public Shape(){
        color = "red";
    }
    
    public Shape(String Color){
        color = Color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String Color) {
        color = Color;
    }
}

class Circle extends Shape{
    protected float radius;

    public Circle(){
        radius = 1.0f;
    }
    
    public Circle(float Radius){
        radius = Radius;
    }

    public Circle(float Radius, String Color){
        radius = Radius;
        color = Color;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float Radius) {
        radius = Radius;
    }

    public float getArea() {
        return ((float) Math.PI)* ((float)Math.pow(radius, 2));
    }

    public float getPerimeter() {
        return 2*(float)Math.PI*radius;
    }
}

class Rectangle extends Shape{
    protected float width;
    protected float length;

    public Rectangle(){
        width = 1.0f;
        length = 1.0f;
    }

    public Rectangle(float Width, float Length){
        width = Width;
        length = Length;
    }

    public Rectangle(float Width, float Length, String Color){
        width = Width;
        length = Length;
        color = Color;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float Width) {
        width = Width;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float Length) {
        length = Length;
    }

    public float getArea() {
        return width*length;
    }

    public float getPerimeter() {
        return 2*(length+width);
    }
}

class Square extends Rectangle{
    public Square(){
        length = 1.0f;
        width = length;
    }

    public Square(float side){
        length = side;
        width = length;
    }

    public Square(float side, String Color){
        length = side;
        width = length;
        color = Color;
    }

    public float getSide() {
        return length;
    }

    public void setSide(float side) {
        length = side;
        width =length;
    }
}

public class TestShape {
    public static void main(String[] args) {
        // Testing public methods
        Circle c1 = new Circle();
        System.out.println(c1.color + " " + c1.radius);

        Circle c2 = new Circle(4.5f,"Black");
        c2.setColor("Blue");
        System.out.println(c2.getColor() + " " + c2.getRadius());

        Square s1 = new Square(2.5f);
        System.out.println(s1.color+" "+s1.getWidth()+" "+s1.getLength());
        
        // Array of objects of type Shape
        Shape []obj = new Shape[3];

        // All subclasses of Shape
        obj[0] = new Circle(1.5f,"blue");
        obj[1] = new Rectangle(5.6f,2.5f,"orange");

        // All subclasses of Rectangle
        obj[2] = new Square(3.4f,"green");    
        
        System.out.println("Area of circle: "+((Circle)obj[0]).getArea());
        System.out.println("Perimeter of circle: " +((Circle)obj[0]).getPerimeter());

        System.out.println("Area of rectangle: " +((Rectangle)obj[1]).getArea());
        System.out.println("Perimeter of rectangle: " +((Rectangle)obj[1]).getPerimeter());

        System.out.println("Area of square: " +((Square)obj[2]).getArea());
        System.out.println("Perimeter of square: " +((Square)obj[2]).getPerimeter());
    }
}
