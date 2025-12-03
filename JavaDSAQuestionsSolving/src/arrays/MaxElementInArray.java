package arrays;

public class MaxElementInArray {
	
	
	           public int MaximumElement(int num[]){
	        	   int max = num[0];
	        	   
	        	   for(int i=1; i<num.length; i++) {
	        		   if(max<num[i]) {
	        			   max = num[i];
	        		   }
	        		  
	        	   }
	        	   return max;
	        	  
	        	   
	           }
              public static void main(String[] args) {
            	  MaxElementInArray m1 = new MaxElementInArray();
            	  int num[] = {11,12,24,34,24};
            	  int result = m1.MaximumElement(num);
            	  System.out.println("Maximum element in an array would be :" + result);
			}
}
