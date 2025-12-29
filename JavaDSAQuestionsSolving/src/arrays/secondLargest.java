package arrays;

public class secondLargest {
             public void largest(int arr[]) {
            	 int largest = Integer.MIN_VALUE;
        		 int secondLargest = Integer.MIN_VALUE;
            	 for(int i=0; i<arr.length; i++) {
            		if(arr[i]>largest) {
            			secondLargest = largest;
            			largest =arr[i];
            		}
            		else if(arr[i]>secondLargest && arr[i]!=largest) {
            			secondLargest = arr[i];
            		} 
            	 }
            	 System.out.println("First Largest : " + largest);
            	 System.out.println("Second Largest : " + secondLargest);
             }
             
             public static void main(String[] args) {
            	 int arr[] = {4,5,6,7,8,9};
				secondLargest s = new secondLargest();
				s.largest(arr);
			}
	
}
