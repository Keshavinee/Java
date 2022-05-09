import java.util.Scanner;

class Employee{
    String name;
    int id;
    String designation;
    int yearsOfExperience;
    double basicpay, DA, HRA, LIC, PF;
    int noOfHours;

    Scanner in = new Scanner(System.in);

    void assignInput(){
        String s;

        System.out.print("Enter your name: ");
        name = in.nextLine();
        
        System.out.print("Enter your id: ");
        id = in.nextInt();

        System.out.print("Enter your designation: ");
        designation = in.next();

        System.out.print("Enter years of experience: ");
        yearsOfExperience = in.nextInt();

        System.out.print("Enter no. of hours worked: ");
        noOfHours = in.nextInt();

        System.out.print("Enter your basicpay: ");
        id = in.nextInt();

        System.out.print("Do you opt for LIC? (y/n): ");
        s = in.next();

        if (s=="y") LIC = 1000.0;
        else LIC = 0.0;
    }

    double grossPay(){
        if (designation.equals("Intern")) {
            DA = 2000.0;
            HRA = 1000.0;
            System.out.print("Enter hourly wage: ");
            return ((double) noOfHours*(in.nextDouble())) + DA + HRA;
        }

        else if (designation.equals("Manager")) {
            DA = 0.4 * basicpay;
            HRA = 0.1 * basicpay;
            return basicpay + DA + HRA;
        }

        else if (designation.equals("Trainee")| designation.equals("Analyst") | 
        designation.equals("Software engineer") | designation.equals("TeamLead") ){
            DA = 0.3 * basicpay;
            HRA = 0.1 * basicpay;
            return basicpay + DA + HRA;
        }

        else{
            return 0.0;
        }
    }

    double netPay(){
        double deductions = 0.0;
        if (designation.equals("Intern")) {
            PF = 500.0;
            deductions = PF + LIC;
        }

        else if (designation.equals("Manager")) {
            PF = 0.8 * basicpay;
            deductions = PF + LIC;;
        }

        else if (designation.equals("Trainee")| designation.equals("Analyst") | 
        designation.equals("Software engineer") | designation.equals("TeamLead") ){
            PF = 0.8 * basicpay;
            deductions = PF + LIC;
        }
        return grossPay()- deductions;
    }

    void display(){
        System.out.println("Name : "+name);
        System.out.println("ID : "+id);
        System.out.println("Gross pay : "+grossPay());
        System.out.println("Net pay : "+netPay());
    }

    void promote(){
        if (yearsOfExperience >= 10) {
            designation.equals("Manager");
            basicpay = 20000.0;
        }

        else if (yearsOfExperience >= 20) {
            designation.equals("Intern");
            basicpay = 30000.0;
        }
    }
}

public class Salary {
    public static void main(String[] args) {
        Employee arr[] = new Employee[2];
        arr[0] = new Employee();
        arr[0].assignInput();
        arr[0].display();

        System.out.println("\n");

        /*arr[1] = new Employee();
        arr[1].assignInput();
        arr[1].display();

        arr[1].promote();*/
    }
}
