package shapes;

public class Square {
    protected float side;

	public Square(){
		side = 1.0f;
	}
	
	public Square(float side){
		this.side = side;
	}
	
	public float getSide(){
		return side;
	}
	
	public void setSide(float side){
		this.side = side;
	}
	
	public float getArea(){
		return (float) (side * side);
	}
	
	public float getPerimeter(){
		return (float) (4 * side);
	}
}

