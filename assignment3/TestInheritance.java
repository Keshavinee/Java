import java.util.Scanner;

class Person{
	private int aadhar;
	private String name;
	private String address;
	private char gender;
	
	public Person(int Aadhar, String Name, String Address, char Gender){
			aadhar = Aadhar;
			name = Name;
			address = Address;
			gender = Gender;
			
	}
	
	public String getName(){
		return name;
	}
	
	public String getAddress(){
		return address;
	}
	
	public void setAddress(String Address){
		address = Address;
	}
	
	public char getGender(){
		return gender;
	}
}

class Student extends Person{
	private String program;
	private int year;
	private float totalmark;
	
	public Student(int Aadhaar, String Name, String Address, char Gender, String Program, int Year, float Totalmark){
		super(Aadhaar, Name, Address, Gender);
		program = Program;
		year = Year;
		totalmark = Totalmark;
	}
	
	public String getProgram(){
		return program;
	}
	
	public int getYear(){
		return year;
	}
	
	public void setYear(int Year){
		year = Year;
	}
	
	public float getTotal(){
		return totalmark;
	}
	
	public void setTotal(float Total){
		totalmark = Total;
	}
	
	public float calGPA(){
		return (float) (totalmark * 4)/100;
	}
}

class Faculty extends Person{
	private String designation;
	private String department;
	private float basicpay;
	private float basic;
	
	public Faculty(int Aadhaar, String Name, String Address, char Gender, String Designation, String Department, float Basicpay){
		super(Aadhaar, Name, Address, Gender);
		designation = Designation;
		department = Department;
		basicpay = Basicpay;
	}
	
	public String getDesig(){
		return designation;
	}
	
	public void setDesig(String desig){
		designation = desig;
	}
	
	public void setBasic(float Basic){
		basic = Basic;
	}
	
	public float getBasic(){
		return basic;
	}
	
	public float calSalary(){
		return (float) (basicpay + (0.615 * basic));
	}
}
public class TestInheritance{
	public static void main(String []args){
		Student s1 = new Student(8620,"Keshav","Erode 638008"
		,'F',"B Tech",2,96.5f);
		System.out.println(s1.getGender() + " " + s1.calGPA());

		Faculty f1 = new Faculty(4567, "Annie Kanmani", 
		"Karur", 'F', "Associate Prof.", "CSE", 25000.0f);
		System.out.println(f1.calSalary()+" "+f1.getAddress());
	}
		
}
