package Composatation;

public class Main {
	
	//Composition in java is the design technique to implement has-a relationship in classes.
	//We can use java inheritance or Object composition in java for code reuse.
	

	public static void main(String[] args) {

		Dimensions dimensions=new Dimensions(20,20,5);
		cases thecases=new cases("220B","apple","290",dimensions);
		
		Resoluation resoluation=new Resoluation(2510,1440);
		monitor themonitor=new monitor("Bq","Ascer","27", resoluation);
		
		
		motherboard themotherboard=new motherboard("BJ-200","Asus",4, 6,"v2,44");
	
	PC pc=new PC(thecases, themonitor , themotherboard);
	
	
	pc.getThemonitor().Drawpixelat(1500, 1200, "red");
	pc.getThemotherboard().loadprogram("windows 7.1");
	pc.getThecases().presspowerbutton();
	}
//the pc has a cases ,has a motherbiard,has a monitor.
	//has a =called composatation
	
	//cpmpositation is actually creating an objects in objects.
}
