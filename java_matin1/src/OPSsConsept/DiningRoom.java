package OPSsConsept;

public class DiningRoom extends Home {
	
	int length;
	int width;
	 public DiningRoom(String door,int length,int width) {
		 super (door);
		 this.length=length;
		 this.width=width;
		 
	 }
	@Override
	int area() {
		// TODO Auto-generated method stub
		return length * width;
	}

}
