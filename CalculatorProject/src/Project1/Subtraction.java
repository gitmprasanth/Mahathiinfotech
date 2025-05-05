package Project1;

public class Subtraction {
   public void subtraction(int[]arr) {
	   int sub=arr[0];
	   for(int i=1;i<arr.length;i++) {
		   sub-=arr[i];
	   }
	   System.out.println("Subtraction is "+sub);
   }
}
