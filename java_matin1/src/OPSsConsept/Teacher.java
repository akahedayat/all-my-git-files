package OPSsConsept;

public class Teacher {
	private String designation ="Teacher";
	private String collegeName = "GW";
	
	
	public String getDesignation() {
		return designation;
	}

 
	public void setDesignation(String designation) {
		this.designation = designation;
	}
 

	public String getCollegeName() {
		return collegeName;
	}

 
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

 
	void job() {
		System.out.println("Teaching Students");
	}

}
