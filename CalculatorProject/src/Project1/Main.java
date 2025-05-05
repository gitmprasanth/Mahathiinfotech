package Project1;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		while(true) {
			start();
		}
	}
	static void start() {
		Scanner sc=new Scanner(System.in);
		System.out.print("CALCULATOR SYSTEM\n1.Press-1 for ADDITION \n2.Press-2 for SUBRACTION \n3.Press-3 for MULTIPLICATION\n4.Press-4 for DIVISION \n5.Press 0 for exit\n");
		System.out.println("Enter the Operation:");

		try {
			int operation=sc.nextInt();
			 if(operation ==0) {
				 System.out.print("Exit from the Calculator");
				 System.exit(0);
			 }
			 else if(operation >4) {
				 System.out.print("Invalid Operation");
			 }

			 else {
					System.out.print("Enter the no of Inputs: ");
					try {
						int noOfinputs=sc.nextInt();
						int arr[]=new int[noOfinputs];
						 for(int i=0;i<arr.length;i++) 
						 {
							 System.out.print("Enter the number: ");
							 try {
								 arr[i]=sc.nextInt();
	 
							 }
							 catch(Exception e){
								 System.err.print("Enter the Numeric value: ");
								 break;
							 }
						 }
						 switch(operation) 
						 {
						   case 1:
							   Addition add=new Addition();
							   add.addition(arr);
							   break;
						   case 2:
							   Subtraction sub=new Subtraction();
							   sub.subtraction(arr);
							   break;
						   case 3:
							   Multiplication mul=new Multiplication();
							   mul.multiplication(arr);
							   break;
						   case 4:
							   Division div=new Division();
							   div.division(arr);
						   	   break;	
						 }

						
					}
					catch(Exception e) {
						System.err.print("Enter the Numeric input");
					}	
		}
				 
		 }
		catch(Exception e) {
			System.err.print("Provide correct Operation code");
		}

	}

}
