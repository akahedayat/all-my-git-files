package OPSsConsept;

public class LivingRoom extends Home{
	
	int length;
	int width;
	public LivingRoom (String door,int length, int width) {
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
