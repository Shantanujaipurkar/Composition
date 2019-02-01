package Composatation;

public class car extends Vehicle{
	
	private int doors;
	private int enginecapacity;
	
	
	//car is a vehicle that is the realtion ship between car and vehicle
	
	

	public car(String name,int doors,int enginecapacity) {
		super(name);
		
		this.doors=doors;
				this.enginecapacity=enginecapacity;
		// TODO Auto-generated constructor stub
	}
	
}
