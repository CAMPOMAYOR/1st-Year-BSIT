import java.util.Scanner;

public class aa{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int a=0;
        int b=0;
        int c=0;
        int total=0;

        System.out.print("Enter number for b: ");
        a=sc.nextInt();
        System.out.print("Enter number for c: ");
        b=sc.nextInt();
        System.out.print("Enter number for d: ");
        c=sc.nextInt();

        total=a+b;

        if(total==c){
            System.out.println("true");
        }else{
            System.out.println("false");
        }

    }
}