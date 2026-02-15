public class NullPointer {
    public static void main(String[] args) {
        String word=null;
        
        try{
            System.out.println(word.length());
        }catch(NullPointerException e){
            System.out.println("Oh no! The string is null, cannot get length.");
        }
    }
}
