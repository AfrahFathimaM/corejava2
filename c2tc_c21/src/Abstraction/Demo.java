package Abstraction;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Square sq=new Square();
		Rectangle r=new Rectangle();
		System.out.println(sq);
		System.out.println(r);
		
		shape sh;
		sh=new Square(4.0f);// create a obj through implementable class methods
		sh.calArea();
		sh.show();
		
		 sh=new Rectangle(4.0f,2.0f);// create a obj through implementable class
		sh.calArea();// abstract method
		sh.show();
		
	}

}
