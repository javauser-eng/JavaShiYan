package CPU;

public class CPU {
	private int speed;
	String model;
	String brand;
	public CPU(){
		
	}	
	public int getSpeed(){
		return speed;
	}	
	public String getBrand(){
		return brand;
	}
public void setSpeed(int speed){
	this.speed=speed;
	} 
public void setBrand(String brand){
	this.brand=brand;
	} 
}
