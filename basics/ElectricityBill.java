class BillAmount{
    int number;
    String name;
    double preRead;
    double curRead;
    String type;
    double total;
    double bill;

    void userInput(int consumerNo, String consumerName, double preMonth, double curMonth, String ebType)
    {
        number = consumerNo;
        name = consumerName;
        preRead = preMonth;
        curRead = curMonth;
        type = ebType;
    }

    double calcBill()
    {
        total = preRead + curRead ;

        if (type.equals("domestic")) {
            
            if (total >= 0 && total <=100) {
                bill = total;
            }

            else if (total >= 101 && total <= 200) {
                bill = 100 + ((total - 100) * 2.5);
            }

            else if (total >= 201 && total <= 500) {
                bill = 350 + ((total - 200) * 4);
            }
            
            else {
                bill = 1550 + ((total - 500) * 6);
            }
        }

        else {
            if (total >= 0 && total <=100) {
                bill = total * 2;
            }

            else if (total >= 101 && total <= 200) {
                bill = 200 + ((total - 100) * 4.5);
            }

            else if (total >= 201 && total <= 500) {
                bill = 650 + ((total - 200) * 6);
            }
            
            else {
                bill = 2450 + ((total - 500) * 7);
            }
        }

        return bill;
    }
}

public class ElectricityBill {
    public static void main(String[] args) {
        
        BillAmount consumer = new BillAmount();
        consumer.userInput(Integer.parseInt(args[0]), args[1], Double.parseDouble(args[2]), Double.parseDouble(args[3]), args[4]);
        System.out.print("Electricity bill = Rs.");
        System.out.println(consumer.calcBill());
    }
}