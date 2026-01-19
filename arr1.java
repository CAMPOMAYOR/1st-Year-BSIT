public class arr1 {
    public static void main(String[] args) {
        String [][] var={
                        {"hh","jj"},
                        {"jh", "er"},
                        {"u", "m"}
                    };
                    for(int x=0; x<var.length; x++){
                        for(int y=0; y<var[x].length;y++ ){
                            System.out.print(var[x][y]+" ");
                        }
                        System.out.println();
                    }
    }
}
