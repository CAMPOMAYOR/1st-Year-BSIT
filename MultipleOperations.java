import java.util.Scanner;

public class MultipleOperations {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

            System.out.println("Enter first number: ");
            int no1=sc.nextInt();
            System.out.println("Enter second number: ");
            int no2=sc.nextInt();

            int sum=0;
            int dif=0;
            int prod=0;

            sum=no1+no1;
            dif=no1-no2;

            System.out.println("Sum: "+sum);
            System.out.println("Difference: "+dif);
            System.out.println("Product: "+prod);
            

        try{
             prod=no1/no2;
            System.out.println("****************************************");
            System.out.println("All operations completed succesfully. ");
            System.out.println("****************************************");
        }catch(ArithmeticException e){
            System.out.println("Error: Cannot divide by zero!");
            System.out.println("****************************************");
            System.out.println("All operations completed succesfully. ");
            System.out.println("****************************************");
        }
            


    }
}
