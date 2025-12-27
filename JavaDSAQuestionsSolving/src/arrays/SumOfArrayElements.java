package arrays;

public class SumOfArrayElements {
	         public void sum(int arr[]) {
	        	 int sum = 0;
	        	 for(int i=0; i<arr.length; i++) {
	        		 sum = sum + arr[i];
	        	 }
	        	 System.out.println(sum);
	         }
             public static void main(String[] args) {
				SumOfArrayElements a = new SumOfArrayElements ();
				int arr[] = {2,4,6,7,8};
				a.sum(arr);
			}
}






