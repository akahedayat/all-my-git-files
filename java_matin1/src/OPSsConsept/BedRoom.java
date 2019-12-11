package OPSsConsept;

public class BedRoom extends Home{
	
	int length;
	int width;
	
	public BedRoom (String door, int length, int width) {
		super(door);
		this.length=length;
		this.width=width;
		
	}



	@Override
	int area() {
		// TODO Auto-generated method stub
		return length * width;
	}
}