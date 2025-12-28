package arrays;

public class ReverseArray {
             public void reverse(int arr[]) {
            	 int rev = 0;
            	 for(int i=arr.length-1; i>=0; i--) {
            		System.out.println("Reverse Array : " + arr[i]);
            	 }
            	 
             }
             public static void main(String[] args) {
				ReverseArray r = new ReverseArray();
				int arr[] = {4,5,6,7,8};
				r.reverse(arr);
			}
}
