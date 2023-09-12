package exception;
import java.util.InputMismatchException;

public class divis {

	public static void divide() {
		int a =6, b= 0, c;
		try
		{
		c = a/b;
		System.out.println("Division is: "+ c);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Exception caught: "+ e.getMessage());
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exception caught: "+ e.getMessage());
		}
		catch(InputMismatchException e)
		{
			System.out.println("Exception caught: "+ e.getMessage());
		}
	}


}
