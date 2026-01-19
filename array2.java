import java.util.Scanner;
public class array2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the size: ");
        int size =sc.nextInt();
        sc.nextLine();

        String [] colors = new String [size];
        //String [] colors2 = {"blue","green", "pink", "yellow", "black" };
        
       // colors[1] ="pink";
        
        //input
        for(int i=0; i<colors.length; i++){
            System.out.print("Enter value for index "+i+": ");
            colors[i]=sc.nextLine();
        }
        System.out.println("-----------------------------------");
        //output
        for(int i=0; i<colors.length; i++){
            System.out.println(colors[i]);
        }
    
    }
}