package OPSsConsept;

public class WindowOne extends MainWindow {
	
	double length;
	double width;
	
	public WindowOne(String glasses, double a,double b) {
		super(glasses);
		this.length=a;
		this.width=b;
	}

double house() {
	return length*width;
	
}



}
