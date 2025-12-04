package arrays;

public class MaxElementInArray {
	
	           //Maximum element in array
	           public int MaximumElement(int num[]){
	        	   int max = num[0];
	        	   
	        	   for(int i=1; i<num.length; i++) {
	        		   if(max<num[i]) {
	        			   max = num[i];
	        		   }
	        		  
	        	   }
	        	   return max;
	        	  
	        	   
	           }
	           
	           //Second maximum element in array
	           public int SecondMaximum(int num[]) {
	        	   int max1 =Integer.MIN_VALUE;
	        	   int max2 = Integer.MIN_VALUE;
	        	   
	        	   for(int i=0; i<num.length; i++) {
	        		   if(num[i]>max1) {
	        			   max2 = max1;
	        			   max1 = num[i];
	        		   }
	        		   
	        		   else if(num[i]>max2 && num[i]!=max1) {
	        			   max2 =num[i];
	        		   }
	        		   
	        	   }
	        	   return max2;
	        	   
	           }
	           
	           //Third Max element in array 
	           public int ThirdMax(int num[]) {
	        	   int max1 = Integer.MIN_VALUE;
	        	   int max2 =Integer.MIN_VALUE;
	        	   int max3 =Integer.MIN_VALUE;
	        	   
	        	   for(int i=0; i<num.length; i++) {
	        		   if(num[i]>max1) {
	        			   max3 =max2;
	        			   max2 =max1;
	        			   max1 =num[i];
	        		   }
	        		   else if(num[i]>max2 && num[i]!=max1) {
	        			   max2 = num[i];
	        		   }
	        		   else if(num[i]>max3 && num[i] != max2 && num[i]!=max1){
	        			   max3 =num[i];
	        		   }
	        	   }
	        	   return max3;
	        	   
	           }
	           
	           
 
              public static void main(String[] args) {
            	  MaxElementInArray m1 = new MaxElementInArray();
            	  int num[] = {11,12,24,34,24};
            	  int result = m1.MaximumElement(num);
            	  int result1 = m1.SecondMaximum(num);
            	  int result2 =m1.ThirdMax(num);
            	  System.out.println("Maximum element in an array would be :" + result);
            	  System.out.println("Second maximum element would be :" + result1);
            	  System.out.println("Third Maximum element would be the :" + result2);
			}
}
