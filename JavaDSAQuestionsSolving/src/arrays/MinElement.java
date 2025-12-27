package arrays;

public class MinElement {
             public void min(int arr[]) {
            	 int min =arr[0];
            	 for(int i=0; i<arr.length; i++) {
            		 if(arr[i]<min) {
            			 min = arr[i];
            		 }
            	 }
            	 System.out.println("Minimum Element : " + min);
             }
             
             public static void main(String[] args) {
				MinElement m = new MinElement();
				int arr[] = {4,5,6,1,8};
				m.min(arr);
			}
}
