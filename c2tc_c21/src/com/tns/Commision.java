package com.tns;
import java.util.Scanner;
public class Commision {
	Scanner sc=new Scanner(System.in);
String name,address;
double sales_amount,commision;
public void getdetails()
{
	System.out.println("enter your name");
	name=sc.next();
	System.out.println("enter city");
	address=sc.next();
	
	System.out.println("enter sales amount");
	sales_amount=sc.nextDouble();
}
public void calculation()
{
	if(sales_amount>=100000) {
		
		commision=(sales_amount*10)/100;
		System.out.println("your commision is"+commision);
	}
	else if(sales_amount<100000 && sales_amount>=50000) {
		
		commision=(sales_amount*5)/100;
		System.out.println("your commision is"+commision);
	}
	else if(sales_amount<50000 && sales_amount>=30000) {
		commision=(sales_amount*3)/100;
		System.out.println("your commision is"+commision);
	}
	else {
		System.out.println("no commision for you !!");
	}
}

}
