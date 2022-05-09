import java.util.Scanner;

class Student{
    String name;
    int id;
    String dept;
    double mark[];

    void assignInput(String Name, int Id, String Dept, double Mark[]){
        name = Name;
        id = Id;
        dept = Dept;
        mark = Mark;
    }

    char calculateGrade(){
        double total = 0.0,avg;
        for (int i = 0; i < 3; i++) {
            total = total + mark[i];
        }
        avg = (double) total/3;
        
        if (avg >= 90) {
            return 'A';
        }
        else if (avg >= 80 && avg<90) {
            return 'B';
        }
        else if (avg >= 70 && avg<80) {
            return 'C';
        }
        else if (avg >= 60 && avg<70) {
            return 'D';
        }
        else if (avg >= 50 && avg<60) {
            return 'E';
        }
        else{
            return 'F';
        }
    }

    void display(){
        System.out.println("Name: "+ name);
        System.out.println("Id: "+ id);
        System.out.println("Dept.: "+ dept);
        System.out.println("Mark 1: "+ mark[0] +" Mark 2: "+ mark[1] +" Mark 3: "+ mark[2]);
    }
}


public class StudentInfo {
    public static void search(int id, Student []arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].id == id) {
                arr[i].display();
            }
        }
    }

    public static void search(String dept, Student []arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].dept == dept) {
                arr[i].display();
            }
        }
    }
    public static void main(String[] args) {
        int n, id;
        String name, dept;
        double mark[] = new double[3];
        Scanner in = new Scanner(System.in);
		
		System.out.print("Number of students:");
		n = in.nextInt();
        Student arr[] = new Student[n];

        for (int i = 0; i < n; i++) {
            arr[i] = new Student();

            System.out.println("Student "+(i+1));

            System.out.print("Enter Name: ");
            name = in.next();
            System.out.print("Enter Dept: ");
            dept = in.next();
            System.out.print("Enter ID: ");
            id = in.nextInt();
            System.out.print("Enter Mark1: ");
            mark[0] = in.nextDouble();
            System.out.print("Enter Mark2: ");
            mark[1] = in.nextDouble();
            System.out.print("Enter Mark3: ");
            mark[2] = in.nextDouble();
            
            arr[i].assignInput(name, id, dept, mark);
        }

        System.out.println("Student Details:");
        for (int i = 0; i < n; i++) {
            System.out.println("Student "+(i+1));
            arr[i].display();
            System.out.println("Grade: "+arr[i].calculateGrade());
        }

        search(101, arr);
        search("bme", arr);
        
        in.close();
    }
}
