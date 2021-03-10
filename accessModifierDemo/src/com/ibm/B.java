package com.ibm;
import com.A;
//B is a type of A??
public class B extends A {
	public int age=10;//shadowing the super class value of age
	void m2() {
		System.out.println(age);
	}

}
