package tightcoupling;

public class MainApp {

	public static void main(String[] args) {
		//Accessing Car method i.e Drive for that Create an Object for Car using new Key Word
		//Car car = new Car();
		//Accessing car method with car object.
		//car.drive();//Car is Driving...
		
		//In future I want to change Car to Bike Object
		//I have to change the Entire Car Object like below.
		
		
		//Bike bike = new Bike();
		//bike.ride();//Bike riding...
		
		//here this object creation was dependent on Bike Class or Car Class
		//This is Tight Coupling.
		
		Vehicle obj = new Car();
		obj.drive();
		
		Vehicle obj2 = new Bike();
		obj2.drive();
		
		//here also right side part new Car or new Bike
		//I want to change so it is Again depend on Car and Bike classes.
		//So I want some External source that will Give the Dependency of the Object.
		//That External Framework is called Spring Framework.
		//By Using SpringFramework we Can Avoid Tight Coupling.
		
	
	}

}
