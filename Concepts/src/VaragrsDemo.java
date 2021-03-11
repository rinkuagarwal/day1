
public class VaragrsDemo {
	public static void main(String[] args) {
		int result=add("ram",2,3,4,5,6,7);//add("ram",new int[]{1,2,4});
		System.out.println(result);
	}
	static int add(String name, int... numbers) {//varargs, or int[] numbers
		int sum=0;
		for (int i = 0; i < numbers.length; i++) {
			sum=sum+numbers[i];
			
		}
		System.out.println(numbers[1]);
		System.out.println(name);
	    return sum;
		
	}
	//static int add(int a, int b){
	//return a+b;}

}
class Book{
	private String genres;
	private Author[] authors;
	Book(){
		authors=new Author[3];
	}
	class Author{
		String name;
		String email;
	}
}
