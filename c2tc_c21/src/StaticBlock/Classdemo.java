package StaticBlock;

public class Classdemo {
public static void main(String[] args) {
		
		// without creating object static methods can be called.
		myclass.display();
		myclass ob = new myclass();
		System.out.println(ob);
		myclass.display();
	}
}
