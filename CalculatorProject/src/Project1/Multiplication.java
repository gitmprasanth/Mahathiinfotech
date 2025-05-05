package Project1;

public class Multiplication {
	public void multiplication(int []arr) {
		int mul=1;
		for(int i=0;i<arr.length;i++) {
			mul*=arr[i];
		}
		System.out.println("Multiplication is "+mul);
	}

}
