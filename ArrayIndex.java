public class ArrayIndex {
    public static void main(String[] args) {
        int x=0;
        try{
            int[] numbers={10, 20,30,40, 50};
            
            for( x =0; x<=5;x++){
                System.out.println("Index number "+x+": "+numbers[x]);
                
            }
        }catch(ArrayIndexOutOfBoundsException e){

            System.out.println("Oh no! Index "+x+" does not exist in the array element.");
        }
        
    }
}
