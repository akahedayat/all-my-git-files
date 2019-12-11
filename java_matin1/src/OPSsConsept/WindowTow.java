package OPSsConsept;

public class WindowTow extends MainWindow {
	double length;
	double widgth;
	public WindowTow(String glasses, double c, double d) {
		super(glasses);
		this.length=c;
		this.widgth=d;
	}
	
	
	@Override
	double house() {
		// TODO Auto-generated method stub
		return length * widgth;
	}

	
}
