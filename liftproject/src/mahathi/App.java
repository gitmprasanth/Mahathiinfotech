package mahathi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.*;
public class App {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		LiftserviceImpl ls=new LiftserviceImpl();	
		LinkedHashMap<Lift,Integer>hs=new LinkedHashMap<>();
		System.out.print("Enter the no of Lifts:");
		int numberOfLifts=sc.nextInt();
		int lift=1;
		for(int i=0;i<numberOfLifts;i++) {
			hs.put(new Lift(),lift);
			lift++;
		}
		while(true) {
			System.out.println("Select the lift:");
			int l=sc.nextInt();
			if(l<=numberOfLifts) {
			    System.out.println("Enter the floor:");
				int floorpos=sc.nextInt();
				for(Lift li:hs.keySet()) {
					if(l==hs.get(li)) {
					  ls.move(li, floorpos);	
					}
				}

			}
			else {
				System.err.println("Enter the Valid Lift");
			}
			
			displayAll(hs);
		}

	}
	static void displayAll(LinkedHashMap<Lift,Integer>hs) 
	{
		
		for(Lift li:hs.keySet()) {
			System.out.println("Lift "+ hs.get(li)+" is in the "+li.getLastposition()+"th Floor");
		}
		
	}


}
