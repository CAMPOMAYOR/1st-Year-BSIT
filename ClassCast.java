
public class ClassCast {
    public static void main(String[] args) {

         Object no="Word";

         try{
            
            int x=(int)no;

         }catch(ClassCastException e){
            System.out.println("Oh no! cannot cast String to Integer. ");
         }
    }
}
