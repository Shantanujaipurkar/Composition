package Composatation;

public class monitor {

	
	
	private String model;
	private String manufacturer;
	private int Screensize;
	private Resoluation nativeResoluation;

	
	public monitor(String model, String manufacturer, String screensize, Resoluation nativeResoluation) {
		super();
		this.model = model;
		this.manufacturer = manufacturer;
		this.Screensize = Screensize;
		this.nativeResoluation = nativeResoluation;
	}
	
	public void Drawpixelat(int x,int y,String color) {
		System.out.println("Draw in pixel at "+x+ ","+y+ " in  color "+color);
	}

	public String getModel() {
		return model;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public int getScreensize() {
		return Screensize;
	}

	public Resoluation getNativeResoluation() {
		return nativeResoluation;
	}
	
}
