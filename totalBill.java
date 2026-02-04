import java.util.Scanner;

public class totalBill {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter price of item A: ");
        double p1 = sc.nextDouble();
        System.out.print("Enter quantity of item A: ");
        double q1 = sc.nextDouble();

        System.out.print("Enter price of item B: ");
        double p2 = sc.nextDouble();
        System.out.print("Enter quantity of item B: ");
        double q2 = sc.nextDouble();

        System.out.print("Enter price of item C: ");
        double p3 = sc.nextDouble();
        System.out.print("Enter quantity of item C: ");
        double q3 = sc.nextDouble();

        double t1=p1*q1;
        double t2=p2*q2;
        double t3=p3*q3;

        double total=t1+t2+t3;
        double dis=0;
        
        if(total>500){
            dis=total*0.1;
        }

        double bill=total-dis;
        System.out.println();
        System.out.println("Total bill before discount: "+total);
        System.out.println("Discount applied (10%): "+dis);
        System.out.println("Final total bill: "+bill);

    }
}
