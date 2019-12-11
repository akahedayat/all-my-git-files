package Fourth_code;

public class Array_code {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
 int []students;
 students=new int[60];
 students[0]=10;

	students[0]=11;
	students[1]=12;                                         
	students[2]=13;
	students[3]=14;
	students[4]=15;
	students[5]=16;
	//System.out.println("School limit "+students.length);
	
	
	System.out.println("Class : "+students[0]);
	System.out.println("Class : "+students[1]);
	System.out.println("Class : "+students[2]);
	System.out.println("Class : "+students[3]);
	System.out.println("Class : "+students[4]);
	System.out.println("Class : "+students[5]);
	System.out.println("Class : "+students[6]);
	
	String[] name;
	name= new String[4];
	name[0]="Hedayat ";
	name[1]="Nariman";
	name[2]="Ahmad";
	name[3]="Omid";
/*	System.out.println("The roll number for "+name[0]+"is "+students [0]);
	System.out.println("The roll number for " +name [1]+" is "+students  [1]);
	System.out.println("The roll number for "+name [2]+" is "+students[2]);
	System.out.println("The roll number for " +name [3]+" is "+students[3]);*/
	
	for(int i=0;i<students.length;i++) {
		students[i]=i+i;
	//System.out.println(students[i]); i have to ask question about it.
	
	int [][] software;
	software= new int [6][8];
	software[0][0]=66;
	software[0][1]=55;
	software[5][7]=100;
	//System.out.println(software[5][7]);
	
	}

}}
