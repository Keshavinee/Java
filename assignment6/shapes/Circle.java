package shapes;

public class Circle{
    protected float radius;
	
	public Circle(){
		radius = 1.0f;
	}
	
	public Circle(float radius){
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

