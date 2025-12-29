package arrays;

public class EvenElement {
	         public void even(int arr[]) {
	        	 System.out.println("Even ");
	        	 for(int i=0; i<arr.length; i++) {
	        		 if(i%2==0) {
	        			System.out.println(arr[i]);
	        		 }
	        		 System.out.println(i);
	        	 }
	         }
             public static void main(String[] args) {
			           int arr[] = {4,5,6,7,8};
			           
			           EvenElement e = new EvenElement();
			           e.even(arr);
			}
}
