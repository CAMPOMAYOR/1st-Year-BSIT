import java.util.Scanner;
public class hcf {
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        int no1= sc.nextInt();
        System.out.print("Enter second number: ");
        int no2=sc.nextInt();
        
        while(no1 !=no2){
            
            if(no1>no2){
                no1=no1-no2;
            }else{
                no2=no2-no1;
            }
            
        }
        
        System.out.println("HCF is "+no1);
        
    }
}

