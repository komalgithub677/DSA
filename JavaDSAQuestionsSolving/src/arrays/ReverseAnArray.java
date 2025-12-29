package arrays;

public class ReverseAnArray {
             public static void main(String[] args) {
				int arr[] = {4,5,6,7,8};
				int n = arr.length;
				int start =0 ,end = n-1;
				
				while(start<=end) {
					int temp =arr[start];
					arr[start] = arr[end];
					arr[end] = temp;
					start++;
					end--;
				}
				
				for(int i=0; i<n; i++) {
					System.out.println(arr[i]);
				}
			}
}
