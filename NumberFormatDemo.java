import java.util.Scanner;

public class NumberFormatDemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        try{
            System.out.println("Enter a number: ");
            String num=sc.nextLine();
            
            int no=Integer.parseInt(num);
            System.out.println("Number: "+no);
        }catch(NumberFormatException e){
            System.out.println("Invalid input! Please enter a valid integer.");
        }
        


    }
}
