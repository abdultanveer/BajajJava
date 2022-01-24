package basics.overriding;
class Vehicle{  
	//defining a method  
	void run(){System.out.println("Vehicle is running");}  
}  
//Creating a child class  
public class Bike2 extends Vehicle{  
	//defining the same method as in the parent class  
	void run(){System.out.println("Bike is running safely");}  

	public static void main(String args[]){  
		Vehicle veh; //reference is created on the stack memory
		veh = new Bike2();//creating object -- on heap memory
		veh.run();//calling method  
	}  
}  