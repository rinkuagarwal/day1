package com.ibm.sortedset;


import java.util.Set;
import java.util.TreeSet;

public class SortedSetDemo {
public static void main(String[] args) {
	
	Set<String> names=new TreeSet<String>();//here insertion order does matter , sorting matters here,sorting done acc to ASCII
	
for (int i = 0; i < 30; i++) {
	names.add("ajay");
	names.add("Ajay");
	names.add("Ram");
	
}
System.out.println(names);
}//o/p is Ajay acc to  ASCII values
}
