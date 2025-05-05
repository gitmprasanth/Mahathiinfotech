package Project1;

public class Division {
   public void division(int arr[]) {
	   float div=arr[0];
	   for(int i=1;i<arr.length;i++) {
		   div=div/arr[i];
	   }
	   System.out.println("Division is " +div);
   }
}
