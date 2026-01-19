import java.util.Scanner;

public class SBnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter how many numbers: ");
        int n = sc.nextInt();

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        int big = num;
        int small = num;

        for (int i = 2; i <= n; i++) {
            System.out.print("Enter number: ");
            num = sc.nextInt();

            if (num > big) {
                big = num;
            }else if (num < small) {
                small = num;
            }
        }

        System.out.println("The largest number is " +big+" and the smallest number is "+small);
   
    }
}
