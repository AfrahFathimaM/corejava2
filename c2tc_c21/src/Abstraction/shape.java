package Abstraction;

public  abstract class shape {
	protected  float area;
	abstract void calArea();
	// concrete method
	void show() {
		System.out.println("area of shape is"+area);
	}
}
