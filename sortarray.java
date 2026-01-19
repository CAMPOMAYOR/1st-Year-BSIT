public class sortarray {
    public static void main(String[] args) {
        int values[]={5,4,3,3,2,5,1};
        int temp =0;


        for (int x=0; x<values.length; x++){
            for(int y=x; y<values.length; y++){
                if(values[x]>values[y]){
                    temp=values[x];
                    values[x]= values[y]; //swap
                    values[y]=temp;
                }
            }
            System.out.print(values[x]+" ");
        }
    }
}
