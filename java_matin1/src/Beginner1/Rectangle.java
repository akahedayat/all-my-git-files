package Beginner1;

public class Rectangle extends shapeAbs{
	
	double lenght;
	double width;
	
public Rectangle(String shapColor, double recLength, double recWidth) {
	
	super(shapColor);
	
	this.lenght = recLength;
	this.width = recWidth;
	
	
	
}
	
	public double area() {
		return lenght * width;
	}
	
	
	public String toString() {
		return "Rectangle Color is " + super.color + " and Rectange area is " + area();
	}
	
	
	
	 
		
	

	 

}
