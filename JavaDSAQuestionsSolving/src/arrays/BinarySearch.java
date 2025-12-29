package arrays;

public class BinarySearch {
             public boolean search(int arr[] , int key) {
            	 int low =0 , high =arr.length-1;
            	 
            	 while(low<=high) {
            		 int mid = (low+high)/2;
            		 if(arr[mid]==key) {
            			 return true;
            		 }
            		 else if(arr[mid]<key) {
            			 low = mid + 1;
            		 }
            		 else {
            			 high = mid-1;
            		 }
            	 }
            	 return false;
             }
             
             public static void main(String[] args) {
				BinarySearch b = new BinarySearch();
				int arr[] = {12,13,14,14,16};
				int key =12;
				boolean result = b.search(arr, key);
				
				if(result!=false) {
					System.out.println("Element found at index : " + result );
				}
				else {
					System.out.println("Element not found");
				}
			}
}
