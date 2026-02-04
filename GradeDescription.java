import java.util.Scanner;

public class GradeDescription {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter a letter grade (A, B, C, D, E, or F): ");
        String grade =sc.nextLine();

        switch(grade){
            case "a":
                System.out.println("Excellent");
                break;
            case "b":
                System.out.println("Very Good");
                break;
            case "c":
                System.out.println("Good");
                break;
            case "d":
                System.out.println("Fair");
                break;
            case "e":
                System.out.println("Poor");
                break;
            case "f":
                System.out.println("Fail");
                break;
            default:
                System.out.println("Invalid grade");
                
        }
    }
}
