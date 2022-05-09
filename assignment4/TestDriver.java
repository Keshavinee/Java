class Person{
	private String name, address;
	
	public Person(String name, String address){
		this.name = name;
		this.address = address;
	}
	
	public String getname(){
		return name;
	}
	
	public String getAddress(){
		return address;
	}
	
	public void setAddress(String address){
		this.address = address;
	}
}

abstract class Employee extends Person{
	private String empid, dept;
	private int basic;
	
	public Employee(String name, String address, String empid, String dept, int basic){
		super(name, address);
		this.empid = empid;
		this.dept = dept;
		this.basic = basic;
	}
	
	public String getEmpid(){
		return empid;
	}
	
	public String getDept(){
		return dept;
	}
	
	public void setDept(String dept) {
		this.dept = dept;
	}

	public void setBasic(int basic){
		this.basic = basic;
	}
	
	public int getBasic(){
		return basic;
	}
	
	public abstract float calSalary();
}

class Faculty extends Employee{
	private String designation, course;
	
	public Faculty(String name, String address, String empid, String dept, int basic, String designation, String course){
		super(name, address, empid, dept, basic);
		this.designation = designation;
		this.course = course;
	}
	
	public String getDesig(){
		return designation;
	}
	
	public void setDesig(String designation){
		this.designation = designation;
	}
	
	public void setCourse(String course){
		this.course = course;
	}
	
	public String getCourse(){
		return course;
	}
	
	public float calSalary(){
		return (float) (getBasic() * 1.7);
	}
}
interface Student{
	public abstract float[] getmarks();
	public abstract float calcGPA();
}

class TeachingAssistant extends Employee implements Student{
	private String project, course;
	private float []marks;
	
	public TeachingAssistant(String name, String address, String empid, String dept, int basic, String project, String course, float []marks){
		super(name, address, empid, dept, basic);
		this.project = project;
		this.course = course;
		this.marks = marks;
	}
	
	public String getProject(){
		return project;
	}
	
	public String getCourse(){
		return course;
	}
	
	public void setCourse(String course){
		this.course = course;
	}
	
	public float[] getmarks(){
		return marks;
	}

	public float calcGPA(){
		float sum=0.0f;
		for (int i = 0; i < marks.length; i++) {
			sum=sum+marks[i];
		}
		return (float) sum/(marks.length*100.0f);
	}

	public float calSalary() {
		return (float) (getBasic() * 1.9);
	}
}

public class TestDriver {
	public static void main(String[] args) {
		float []marks = {99.8f,37.3f,19.6f};
		Faculty f = new Faculty("Annie Kanmani","Erode", "FE12", "English", 10000, "Associate Prof.", "Technical English");
		TeachingAssistant t = new TeachingAssistant("Kumar", "Chennai", "TA13", "CSE", 6000, "AI", "ML", marks);

		System.out.println(f.getname()+" "+f.getEmpid()+" "+f.getDesig());
		System.out.println(t.getname()+" "+t.getEmpid()+" "+t.getCourse());
	}
}