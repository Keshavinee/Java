import java.util.Scanner;

class PANRequiredException extends Exception{
    public PANRequiredException(String s){
        super(s);
    }
}

class MinBalRequiredException extends Exception{
    public MinBalRequiredException(String s){
        super(s);
    }
}

class NotEnougMoneyInAccountException extends Exception{
    public NotEnougMoneyInAccountException(String s){
        super(s);
    }
}

class AccountNotFoundException extends Exception{
    public AccountNotFoundException(String s){
        super(s);
    }
}

class PANFormatMismatchException extends Exception{
    public PANFormatMismatchException(String s){
        super(s);
    }
}

class BranchNotFoundException extends Exception{
    public BranchNotFoundException(String s){
        super(s);
    }
}

class Account{
    final float minBalance = 2000.0f;
    String array[] = {"Karur","Erode","Covai","Chennai","Madurai"};
    public String name, branch, PAN_num;
    public Long acct_num;
    public float balance;

    public Account(String name, String branch, long acct_num) {
        int f=0;
        this.name = name;

        try {
            for (int i = 0; i < array.length; i++) {
                if (array[i] == branch) {
                    this.branch = branch;
                    f=1;
                    break;
                }
            }
            if (f==0) {
                throw new BranchNotFoundException("Branch is not found!");
            }
        } 
        catch (BranchNotFoundException e) {
            System.out.println(e);
        }
        
        this.acct_num = acct_num;
        balance = 0.0f;
    }
    public void setPANNumber(String PAN_num) {
        try {
            for (int i = 0; i < PAN_num.length(); i++) {
                if (i<5 || i==9) {
                    if (!Character.isAlphabetic(PAN_num.charAt(i))){
						throw new PANFormatMismatchException("PAN number format mismatch!");
					}
                }
                
                else if (i>5 && i<9){
                    if (!Character.isDigit(PAN_num.charAt(i))){
						throw new PANFormatMismatchException("PAN number format mismatch!");
					}
                }
            }
            this.PAN_num = PAN_num;
        } 
        catch (PANFormatMismatchException e) {
            System.out.println(e);
        }
    }

    public void deposit(float amt){
        try {
            if (amt > 25000.0f) {
                throw new PANRequiredException("PAN Number is required to deposit more than 25000!");
            }
        } 
        catch (PANRequiredException e) {
            System.out.println(e);

            try (Scanner sc = new Scanner(System.in)) {
                System.out.print("Enter PAN Number: ");
                setPANNumber(sc.next());
            }
        }
        balance = balance + amt;
    }

    public void withdrawal(float amt) {
        try {
            if (balance-amt < 0){
                throw new NotEnougMoneyInAccountException("Not enough amount in account!");
            }
            else if (balance-amt < minBalance) {
                throw new MinBalRequiredException("Withdrawal amount exceeds minimum balance!");
            }
            else{
                balance = balance - amt;
            }
        } 
        catch (MinBalRequiredException e) {
            System.out.println(e);
        }
        catch (NotEnougMoneyInAccountException e){
            System.out.println(e);
        }
        
    }

    public void display(){
		System.out.println("Name: "+name);
		System.out.println("Account Number : "+acct_num);
		System.out.println("Balance: "+balance);
	}
}

public class TestException2 {
    public static void search(Account []list, Long acct_num){
        int flag = 0;
        for (int i = 0; i < list.length; i++) {
            if (list[i].acct_num == acct_num) {
                System.out.println(list[i].name);
                flag = 1;
                break;
            }
        }
        try {
            if (flag==0) {
                throw new AccountNotFoundException("Account is not found!");
            }
        }
        catch (AccountNotFoundException e) {
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
        Account ac[] = new Account[3];
        ac[0] = new Account("Keshav", "Erode",32455234l);
        ac[1] = new Account("Ram", "Karur",23134441l);
        ac[2] = new Account("Magu", "Namakkal",55533132l);
        ac[0].deposit(23400.50f);
        ac[0].withdrawal(23000.0f);
        ac[1].deposit(3400.53f);
        ac[1].withdrawal(9000.0f);
        ac[2].deposit(30000.50f);
        ac[2].withdrawal(23000.0f);
        search(ac, 21345632l);
    }
}
