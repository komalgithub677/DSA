package arrays;

public class AverageOfArrayElements {
             public void average(int arr[]) {
            	         int sum = 0;
            	         for(int i=0; i<arr.length; i++) {
            	        	 sum = sum + arr[i]; 
            	         }
            	         double average = sum /arr.length;
            	         System.out.println("Average of array elements : " + average);
             }
             public static void main(String[] args) {
				AverageOfArrayElements a = new AverageOfArrayElements();
				int arr[] = {3,4,5,6,7};
				a.average(arr);
			}
}
