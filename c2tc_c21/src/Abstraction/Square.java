package Abstraction;

public class Square extends shape {
private float side;
	
	public Square() {
		side=2.0f;
	}
	public Square(float side) {
		this.side=side;
	}
	@Override
	void calArea() {
		super.area=side*side;
		
	}
	@Override
	public String toString() {
		return "Square [side=" + side + "]";
	}

}
