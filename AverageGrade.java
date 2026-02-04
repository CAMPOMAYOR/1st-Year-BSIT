import java.util.Scanner;

public class AverageGrade {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);

         System.out.print("Enter Calculus grade: ");
         int cal=sc.nextInt();

         System.out.print("Enter Java Programming grade: ");
         int java=sc.nextInt();

         System.out.print("Enter Database grade: ");
         int data=sc.nextInt();

         System.out.print("Enter Introduction to programming grade: ");
         int intro=sc.nextInt();

         int total=cal+java+data+intro;
         double average=total/4;

         System.out.println("Total grade: "+total);
         System.out.println("Average grade: "+average);
         
         if(average>=75){
            System.out.println("Status: Passed");
         }else{
            System.out.println("Status: Failed");
         }
    }
}
