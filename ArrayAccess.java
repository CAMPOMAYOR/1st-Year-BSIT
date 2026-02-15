import java.util.Scanner;

public class ArrayAccess {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        String[] arr={"kiwi", "Lemon", "Cherry", "Tangerine", "Durian"};

        System.out.println("How many indices  do you want to access?: ");
        int inn=sc.nextInt();

        int ent=0;
        try{
            for(int i=1; i<=inn; i++){
            System.out.println("Enter index #"+i+": ");
             ent=sc.nextInt();

            System.out.println("Fruit at index "+ent+": "+arr[ent]);
        }
        System.out.println("All accesses complete.");
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Index "+ent+" does not exist in the array element.");
        }
        

    }
    
}