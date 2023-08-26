package com.tns.scanner;

public class calculation {
public void clas(person p) {
	
	if(p.getIncome()<=16000 && p.getIncome()<=50000) {
		p.setTax(0);
	}
	else if(p.getIncome()>16000  && p.getIncome()<=50000) {
		p.setTax(5);
	}
	else {
		p.setTax(10);
	}
}


}
