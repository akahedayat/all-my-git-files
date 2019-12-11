package sixth_do;

public class B {
	public int book=40;
	private int pen=30;
	protected int pencil=10;
	int notebook= 20;
	
public void mclean() {
	System.out.println("This is Mclean city");
}
public void subract() {
	int a=6000;
	int r=2000;
	int w=a-r;
	System.out.println(w);
		
}
public void addition(int d,int o,int k) {
	int i=d+o+k;
	System.out.println(i);
}
public int getPen() {
	return pen;
}
public void setPen(int pen) {
	this.pen = pen;
}


}
