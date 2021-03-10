package dataconversion;

public class DataDemo {
public static void main(String[] args) {
	int a=-129;//4 bytes
	long long1=a;//8 byte
	System.out.println(long1);
	byte byte1=(byte)a;//1 byte,dangerous,narrowing,downcasting
	System.out.println(byte1);
	
}

}
