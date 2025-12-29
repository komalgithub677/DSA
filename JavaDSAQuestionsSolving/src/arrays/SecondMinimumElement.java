package arrays;

public class SecondMinimumElement {
             public void secondMinimum(int arr[]) {
            	 int firstMin = Integer.MAX_VALUE;
            	 int secondMin = Integer.MAX_VALUE;
            	 
            	 for(int i=0; i<arr.length; i++) {
            		 if(arr[i]<firstMin) {
            			 secondMin = firstMin;
            			 firstMin = arr[i];
            		 }
            		 else if(arr[i]<secondMin && arr[i]!=firstMin) {
            			 secondMin = arr[i];
            		 }
            	 }
            	 System.out.println("Fist Minimum : " + firstMin);
            	 System.out.println("Second Minimum : " + secondMin);
             }
             
             public static void main(String[] args) {
				int arr[]= {5,6,7,8,9};
				SecondMinimumElement s = new SecondMinimumElement();
				s.secondMinimum(arr);
			}
}
