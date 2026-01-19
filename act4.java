import java.util.Scanner;

public class act4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("currency (USD, YEN, BHT, EUR, WON, RUP): ");
        String curr=sc.nextLine();

        System.out.print("amount: ");
        double php=sc.nextDouble();

        if(curr.equals("usd")){
            double usd=php*0.05;
            System.out.println(usd);
        }else if(curr.equals("yen")){
            double yen=php*50;
            System.out.println(yen);
        }else if(curr.equals("yen")){
            double yen=php*50;
            System.out.println(yen);
        }else if(curr.equals("bht")){
            double bht=php*0.5;
            System.out.println(bht);
        }
    }
}
