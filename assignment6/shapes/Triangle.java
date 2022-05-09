package shapes;

public class Triangle{
	float base;
	float height;
    float sideA, sideC;
	
	public Triangle(){
		
		base = 1.0f;
		height = 1.0f;
        sideA = 1.0f;
        sideC = 1.0f;
	}
	
	public Triangle(float base, float height, float sideA, float sideC){
		this.base = base;
		this.height = height;
        this.sideA = sideA;
        this.sideC = sideC;
	}
	
	public float getArea(){
		return (float) (0.5 * base * height);
	}
	
	public float getPerimeter(){
		return (float) (sideA + base + sideC);
	}
}