import java.util.Scanner;

public class IllegalArgument {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter your age: ");
        int age=sc.nextInt();

        try{
             if(age>120){
                    throw new IllegalArgumentException("Invalid input: Age must be between 0 and 100.");
            }else if(age<0){
                throw new IllegalArgumentException("Invalid input: Age must be between 0 and 100.");
            }
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
           
        
     }       
}
