import java.util.*;

class MinorCitizenException extends Exception{
	public String msg;
	public MinorCitizenException(String msg){
		super(msg);
		this.msg = msg;
	}

	public String toString(){
		return msg;
	}
}

class Person{
	public String name;
	public int age;
	public Long adhaar;
	
	public void getInput(){
		String age, aadhar;
		int f = 1;
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter name: ");
			name = sc.next();
			
			try{
				System.out.print("Enter age: ");
				age = sc.next();
				for (int i = 0; i < age.length(); i++) {
					if (Character.isAlphabetic(age.charAt(i))){
						throw new NumberFormatException("Age should contain only numbers!");
					}
				}	
				this.age = Integer.parseInt(age);	
			}
			catch  (NumberFormatException e){
				System.out.println(e);
				System.out.print("Enter age: ");
				this.age = sc.nextInt();
			}
			
			System.out.print("Enter aadhar number: ");
			aadhar = sc.next();
			for (int i = 0; i < aadhar.length(); i++) {
				if (!Character.isDigit(aadhar.charAt(i))){
					this.adhaar = null;
					f=0;
					break;
				}
			}
			if (f==1) {
				this.adhaar = Long.parseLong(aadhar);
			}	

			sc.close();
		}
	}
	
	public void display(){
		System.out.println("Name: "+name);
		System.out.println("Age : "+age);
		System.out.println("Aadhaar: "+adhaar);
	}
	
	public void canVote(){
		try{
			if (age<18){
				throw  new MinorCitizenException("Age is lesser than 18. So you cannot vote!");
			}
			System.out.println("You can vote!");

		}
		catch (MinorCitizenException e){
			System.out.println(e);
		}
	}
	
	public void hasAadhaar(){
		try{
			if (adhaar == null) {
				throw new NullPointerException("There is no valid aadhar for this person.");
			}
			System.out.println("Yes, the person has aadhar.");
		}
		catch(NullPointerException e){
			System.out.println(e);
		}
	}
}

public class TestException1 {
	public static void main(String[] args) {
		Person p = new Person();
		p.getInput();
		p.display();
		p.canVote();
		p.hasAadhaar();
	}	
}