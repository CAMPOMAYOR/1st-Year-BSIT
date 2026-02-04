import java.util.Scanner;

public class FarePaymentSystem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Transportation menu: ");
        System.out.println("1-jeepney (12.00)");
        System.out.println("2-bus (15.00)");
        System.out.println("3-taxi (Flat rate 45.00)");
        System.out.println("4-train (20.00)");
        System.out.print("Slelect a transportation type (1-4): ");
        int fare =sc.nextInt();
        System.out.println();

        int fare1=0;
        

        switch(fare){
            case 1:
                System.out.println("The fare price is 12.00");
                fare1=12;
                break;
            case 2:
                System.out.println("The fare price is 15.00");
                fare1=15;
                break;
            case 3:
                System.out.println("The fare price is 45.00");
                fare1=45;
                break;
            case 4:
                System.out.println("The fare price is 20.00");
                fare1=20;
                break;
            default:
                System.out.println("Invalid transportation type");
        }
        
        System.out.print("Enter the amount of money: ");
         int   money=sc.nextInt();
        

        if(money<fare1){
            System.out.println("Insufficient funds. Please give atlest "+fare1);
        }else{
            int change =money-fare1;
            System.out.println("The change is "+change);
        }

        
    }    
}
