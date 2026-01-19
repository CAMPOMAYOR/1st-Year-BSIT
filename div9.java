public class div9 {
    public static void main(String[] args) {
        
        int total=0;
        System.out.println("numbers divisible by 9 between 100 and 200:");
        for(int i=100; i<=200; i++){
            if(i%9==0){
                System.out.print(i+" " );
                total+=i;
            }
        }
        System.out.println();
        System.out.println("The total is "+total );
        
    }
}

