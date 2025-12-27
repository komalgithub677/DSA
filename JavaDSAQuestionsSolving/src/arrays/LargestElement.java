package arrays;

public class LargestElement {
             public void largest(int arr[]) {
            	    int max = 0;
            	    for(int i=0; i<arr.length; i++) {
            	    	if(arr[i]>max) {
            	    		max =arr[i];
            	    	}
            	    }
            	    System.out.println("Max element : " + max);
             }
             public static void main(String[] args) {
				LargestElement l = new LargestElement();
				int arr[] = {2,3,4,5,6};
				l.largest(arr);
			}
}
