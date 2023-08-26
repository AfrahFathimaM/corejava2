/**
 * 
 */
package com.tns.scanner;
import java.util.Scanner;
/**
 * 
 */
public class preseonexec {
public static void main(String [] args) {
	Scanner obj=new Scanner(System.in);
	String name;
	System.out.println("enter the name");
	name=obj.next();
	System.out.println("enter the income");
	int income=obj.nextInt();
	person per=new person();
	per.setName(name);
	per.setIncome(income);
	calculation cal=new calculation();
	cal.clas(per);
	System.out.println("after calculation , the tax is");
	System.out.println(per);
	
}


}
