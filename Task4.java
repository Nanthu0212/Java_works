public class Task4 {
    public static void main(String[] args){
        for (int i=1; i <=3;i++){
            for (int j=1; j <=3;j++){ 
                if (j==i){
                    System.out.print( "1" + "\t");
                }
                else{
                    System.out.print( "0" + "\t");
                }
            }
            System.out.println();
        }
    }
    
}
