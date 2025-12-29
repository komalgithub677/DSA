package arrays;

public class CopyArrayElements {
             public static void main(String[] args) {
				int[] arr1 = {3,4,5,6,7,8};
				int[] arr2 = new int[arr1.length];
				
				for(int i=0; i<arr1.length; i++) {
					arr2 [i] = arr1[i]; 
				}
				
				//printed copied array
				for(int i=0; i<arr2.length; i++) {
					System.out.println("Arr2 elements : " + arr2[i]);
				}
			}
}
