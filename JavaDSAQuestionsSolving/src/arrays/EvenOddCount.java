package arrays;

public class EvenOddCount {
             public void evenOdd(int arr[]) {
            	    int count =0;
            	    for(int i=0; i<arr.length; i++) {
            	    	if(i%2==0) {
            	    		count++;
            	    		System.out.println("even count : " + i);
            	    	}
            	    	else {
            	    		count++;
            	    		System.out.println("Odd count : " + i);
            	    	}
            	    }
            	    System.out.println(count);
             }
             public static void main(String[] args) {
				EvenOddCount  e = new EvenOddCount();
				int arr[] = {4,5,6,7,8};
				e.evenOdd(arr);
			}
}
