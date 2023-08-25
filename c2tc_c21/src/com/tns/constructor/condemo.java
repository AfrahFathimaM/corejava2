package com.tns.constructor;
import java.util.Scanner;
public class condemo {
public static void main(String [] args) {
	Scanner sc=new Scanner(System.in);
	String name,city;
	int id;
	System.out.println("enter customer id");
	id=sc.nextInt();
	System.out.println("enter customercity");
	city=sc.next();
	System.out.println("enter name");
	name=sc.next();
	 constructor c1=new constructor();
	 c1.setCustomerId(id);
	 c1.setCustomerCity(city);
	 c1.setName(name);
	 System.out.println(c1);
}
}
