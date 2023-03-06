package com.belt;

public class BeltC {
	public BeltR getBelt(String sr) {
		if(sr==null) {
			return null;
		}
		if(sr.equalsIgnoreCase("A")){
			return new A();
		}
		else if(sr.equalsIgnoreCase("B")) {
			return new B();
		}
		else if(sr.equalsIgnoreCase("C")) {
			return new C();
		}
		else if(sr.equalsIgnoreCase("D")) {
			return new D();
		}
		else if(sr.equalsIgnoreCase("E")) {
			return new E();
		}
		else if(sr.equalsIgnoreCase("Bill")) {
			return new Bill();
		}
		else if(sr.equalsIgnoreCase("GST")) {
			return new GST();
		}
		return null;		
	}
}
