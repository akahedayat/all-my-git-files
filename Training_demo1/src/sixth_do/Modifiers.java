package sixth_do;

public class Modifiers {
	public int water= 25;
	
	protected int bread=20;
	
	int people=60;
	int person=80;
	private int hidden=900;
	
	public void number() {
		System.out.println(hidden);
	}
public void number(int hidden) {
	this.hidden=hidden;
	System.out.println("This is global variable : "+this.hidden);
}
public int getHidden() {
	return hidden;
}
public void setHidden(int hidden) {
	this.hidden = hidden;
	System.out.println(this.hidden);
}
}
