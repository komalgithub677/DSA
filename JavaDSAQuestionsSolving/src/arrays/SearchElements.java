package arrays;

import java.util.Scanner;

public class SearchElements {
             public  void search(int arr[] , int key) {
            	 
            	 key = 30;
            	 boolean found = false;
            	 
            	 for(int i=0; i<arr.length; i++) {
            		 if(arr[i]==key) {
            			 found = true;
            			 System.out.println("Element found at index : " + i);
            			 break;
            		 }
            	 } 
            	 
            	 if(!found) {
            		 System.out.println("Element not found");
            	 }
             }
             
             public static void main(String[] args) {
				SearchElements s = new SearchElements();
				int arr[] = {35 ,40,56,76,30};
				s.search(arr, 30);
			}
}
