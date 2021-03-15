
public class BubbleSort {
public static void main(String[] args) {
	int[] numbers= {7,9,3,6};
	bubbleSort(numbers); //sorting array elements using bubble sort  
    
   System.out.println("Array After Bubble Sort");  
   for(int i=0; i < numbers.length; i++){  
           System.out.print(numbers[i] + " ");  
   } 
   
}
static void bubbleSort(int[] numbers) {
	int count=0;
    int temp = 0;  
     for(int i=0; i < numbers.length; i++){  
    	 count++;
             for(int j=1; j < (numbers.length-i); j++){  
                      if(numbers[j-1] > numbers[j]){  
                             temp = numbers[j-1];  
                             numbers[j-1] = numbers[j];  
                             numbers[j] = temp;  
                             count++;
                             
                     }  
                      
             }  
     }  
     System.out.println(count);
}  
}
