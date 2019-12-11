package Beginner1;

public class CircleAbs extends shapeAbs {

	double radio;

	public CircleAbs(String shapColor, double circleRadio) {
		super(shapColor);

		this.radio = circleRadio;

	}

	//@overrid
	
	double area () {
		return Math.PI * Math.pow(radio, 4);
	}
	
public String toString() {
	return " circl color is " + super.color + " the circle area is   " + area();
}
	

}
