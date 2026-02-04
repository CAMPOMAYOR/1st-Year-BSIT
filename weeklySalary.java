import java.util.Scanner;

public class weeklySalary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Number of hours worked: ");
        double hours=sc.nextDouble();

        System.out.print("Enter hourly rate: ");
        double rate=sc.nextDouble();

        
        double pay=0;
        double ot=0;
        double subra=0;
        double a=0;

        if(hours>40){
            subra=hours-40;
            pay=rate*40;
            a=1.5*rate;
            ot=a*subra;
        }else{
            pay=hours*rate;
        }
    
        System.out.println("Regular pay: "+pay);
        System.out.println("Overtime pay: "+ot);
        System.out.println("Total salary: "+(pay+ot));
        

    }
}
