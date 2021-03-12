package com.ibm;
class Book{
	private String title;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) throws MyException {//for non custom we use Exception and for custom we use class name of the exception class
		if(title==null) {
			//throw new IllegalArgumentException();//used for unchecked exception
//checked exception the code as follow below
			throw new MyException();//name of exception depends on us whether it is custom or non custom
		}
		this.title = title;
	}
	@Override
	public String toString() {
		
		return this.title;
	}
	
}
public class Application {
public static void main(String[] args) {
//to override the tostring object to print what we want we used tString() and make a override method call
	  //Book book=new Book();
	 // book.setTitle("learning java");
	 // System.out.println(book.toString());
//this block of code is used when we want checked exception to be executed as to complete the execeution
	Book book=new Book();
	try {
		book.setTitle(null);
	}catch(IllegalArgumentException illegalArgumentException) {//since it is lower at flowchart so it is at top
		
	} 
	catch (Exception e) {
		e.printStackTrace();
	}
	finally {
		System.out.println("Always");
	}
	System.out.println(book.toString());
//to override the tostring object to print what we want we used tString() and make a override method call	
	//Book book1=new Book();
	//book1.setTitle("learning javaScript");
	//System.out.println(book1);
//this is a method for using inbuilt toString class and prints hash values
	//Book book=new Book();
	//book.setTitle("learning java");
	//System.out.println(book.toString());
	//Book book1=new Book();
	//System.out.println(book1);//if we dont use toString also it will print the same output as toString is inbuilt
	
}
}
