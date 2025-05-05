package mahathi;

import java.util.*;
public class Lift {
	   private int position=0;
	   private  int lastposition=0;
	   public void setposition(int position) {
		   this.position=position;
	   }
	   public int getPosition(){
		   return position;
	   }
	   public void setLastposition(int lastposition)
	   {
		   this.lastposition=lastposition;
	   }
	   public int getLastposition() {
		   return lastposition;
	   }
	}
interface Liftservice{
	void move(Lift lift,int position);  //method overloading
	void move(Lift lift);   
}

class LiftserviceImpl implements Liftservice{

	@Override
	public  void move(Lift lift, int position) {  		//method overriding	  
		int currpos= position;
		if(position<=5) {
			lift.setLastposition(currpos);	
			System.out.println("You are reached the "+position+" floor");
		}
		else {
			System.err.println("Enter the valid floor");
		}
		}
		
	

	@Override
	public void move(Lift lift) {
		
	}
	
		
}







