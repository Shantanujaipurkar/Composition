package Composatation;

public class PC {
	
	private cases thecases;
	private monitor themonitor;
	private motherboard themotherboard;
	
	
	public PC(cases thecases, monitor themonitor, motherboard themotherboard) {
		super();
		this.thecases = thecases;
		this.themonitor = themonitor;
		this.themotherboard = themotherboard;
	}


	public cases getThecases() {
		return thecases;
	}


	public monitor getThemonitor() {
		return themonitor;
	}


	public motherboard getThemotherboard() {
		return themotherboard;
	}	
}
