package Composatation;

public class cases {

	
	private String model;
	private String manufacturer;
	private String powersupply;
	private Dimensions nativeDimensions;
	
	
	public cases(String model, String manufacturer, String powersupply, Dimensions nativeDimensions) {
		super();
		this.model = model;
		this.manufacturer = manufacturer;
		this.powersupply = powersupply;
		this.nativeDimensions = nativeDimensions;
	}
	
	
	public void presspowerbutton() {
		System.out.println("power button pressed");
	}


	public String getModel() {
		return model;
	}


	public String getManufacturer() {
		return manufacturer;
	}


	public String getPowersupply() {
		return powersupply;
	}


	public Dimensions getNativeDimensions() {
		return nativeDimensions;
	}	
}
