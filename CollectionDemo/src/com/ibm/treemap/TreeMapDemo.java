package com.ibm.treemap;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {//here sorting is done according to keys
public static void main(String[] args) {
	Map<String,String>accounts=new TreeMap<String, String>();

	//accounts.put("2","account2");
	//accounts.put("1","account1");
	//System.out.println(accounts);
	accounts.put("-2","account2");
	accounts.put("-1","account1");//here -1 is treated as string not number
	System.out.println(accounts);
}
}
