package arrays;

public class PositiveNegativeZero {
             public void positiveNegativeZero(int arr[]) {
            	 int evenCount = 0;
            	 int oddCount = 0;
            	 int zeroCount =0;
            	 
            	 for(int i=0; i<arr.length; i++) {
            		 if(arr[i] == 0) {
            			 zeroCount++;
            		 }
            		 else if(arr[i]%2==0) {
            			 evenCount++;
            		 }
            		 else {
            			 oddCount++;
            		 }
            	 }
            	 System.out.println("Even Element Count : " + evenCount);
            	 System.out.println("Zero Element count : " + zeroCount);
            	 System.out.println("Odd Element Count : " + oddCount);
             }
             
             public static void main(String[] args) {
				int arr[] = {4,6,7,8,9};
				
				PositiveNegativeZero p = new PositiveNegativeZero();
				p.positiveNegativeZero(arr);
				
			}
}
