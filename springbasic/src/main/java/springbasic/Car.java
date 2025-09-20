package springbasic;

public class Car implements Vehicle{
	//Tight Coupling Example
	//Car is Having some Method drive
	public void drive() {
		System.out.println("Car is Driving...");
	}
	
}
