public class Loops{
	public static void main(String Args[]) {
		//forloop
		for(int i=0;i<=10;i++) {
			System.out.println(i+ " "+ "jay jay Shree radhe");
			
		}
		// WhileLoop
		int i=1;
		while (i<=10) {
			i++;
			System.out.println(i+ " "+ "jay jay Shree krishna");
			
		}//Do While
		int j=1;
		do {
			j++;
			System.out.println(j+ " "+ "Sita Raam");
		}while(j<=10);
		
		//Arrays
		
		   int[] num = {1,2,3,4,5,6,7,8,9,10};
		   System.out.println("1. Printing array elements using a for loop:");
		   for (int a=0;a<num.length;a++) {
			   System.out.println(num[a]);
			   
		   }
     //reverseArray
		   int[] numb = {1,2,3,4,5,6,7,8,9,10};

	        // Reverse the array using a for loop:
	        for (int i1 = 0; i1 < numb.length / 2; i1++) {
	            int temp = numb[i1];
	            numb[i1] = numb[numb.length - 1 - i1];
	            numb[numb.length - 1 - i1] = temp;
	        }
	        
	        // Print the reversed array:
	        System.out.println("Reversed array:");
	        for (int i1 = 0; i1 < numb.length; i1++) {
	            System.out.print(numb[i1] + " ");
	        }
		   
	
	}
}