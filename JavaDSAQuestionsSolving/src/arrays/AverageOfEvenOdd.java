package arrays;

public class AverageOfEvenOdd {
             public void evenOdd(int arr[]) {
            	 int sum = 0;
            	 for(int i=0; i<arr.length; i++) {
            		 if(i%2==0) {
            			 sum = sum + arr[i];
            		 }
            	 }
            	 System.out.println(sum);
             }
             
             public static void main(String[] args) {
				AverageOfEvenOdd a =  new AverageOfEvenOdd();
				int arr[] = {4,5,6,7,8,9};
				a.evenOdd(arr);
			}
}
