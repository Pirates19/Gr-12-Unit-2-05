/****************************************************************************
 *
 * Created by: Nicholas Ellul
 * Created on: Oct 2016
 * Vehicle class allows you to create vehicle objects.
 * 
 ****************************************************************************/

public class Vehicle {

	private String _licensePlateNumber;
	private String _colour;
	private int _numberOfDoors;
	private double _speed = 0;
	private double _maxSpeed;

	public Vehicle(String plate, String colour, int numberOfDoor, double maxVelocity){
		this._licensePlateNumber = plate;
		this._colour = colour;
	    this._numberOfDoors = numberOfDoor;
	    this._maxSpeed = maxVelocity;
	}
	
	
	public void printState(){
		
		System.out.println("Speed: " + this._speed);
		System.out.println("Max Speed: " + this._maxSpeed);
		System.out.println("Colour: " + this._colour);
		System.out.println("# of Doors: " + this._numberOfDoors);
		System.out.println("License Plate Number: " + this._licensePlateNumber);
		System.out.println();
	}
	
	
	protected void accelerate(double accelerateAmount){
		
		if(this._speed <= this._maxSpeed - accelerateAmount){
			
			this._maxSpeed += accelerateAmount;
			
		}
		
	}
	
	
	protected void brake(double brakeAmount){
		
		if(this._speed >= brakeAmount){
			
			this._maxSpeed -= brakeAmount;
			
		}
		else if(this._speed <= brakeAmount){
			
			this._speed = 0;
			
		}	
		
	}
	
	
}
