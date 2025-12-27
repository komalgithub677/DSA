package arrays;

public class MinEleInArray {
             public int minimumElement(int num[]) {
            	 int min = num[0];
            	 
            	 for(int i=1; i<num.length; i++) {
            		 if(min>num[i]) {
            			 min = num[i];
            		 }
            	 }
            	 return min;
             }
             
             public int secondMinimumElement(int num[]) {
            	 int m1 = Integer.MAX_VALUE;
            	 int m2 =Integer.MAX_VALUE;
            	 
            	 for(int i=0; i<num.length; i++) {
            		 if(num[i]<m1) {
            			 m2 =m1;
            			 m1 =num[i];
            			 
            		 }
            	 }
            	 return m2; 
             }
             
             public static void main(String[] args) {
            	 MinEleInArray m = new MinEleInArray();
            	 int num[] = {32 ,34,56,78,1};
            	 int result = m.minimumElement(num);
            	 int result1 = m.secondMinimumElement(num);
            	 System.out.println("Minimum Element in array  "+ result);
            	 System.out.println("Second minimum element in array :" + result1);
			}
	
}
