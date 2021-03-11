package com.ibmm;

import com.ibm.search.A;

public interface IOrder {
	String str="Ram";
	A a=new A();

}
//java.lang
class A{
	private String name;
	
}
class B{
	A a=new A();
	a.name();
	
}