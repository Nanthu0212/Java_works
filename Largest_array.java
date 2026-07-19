public class Largest_array {
    public static void main(String[] args){
        int[] arr = {10, 25,5,6,1,80,46,7,8};
        int max = arr[0];
        for(int i=1; i<arr.length; i++){
            if (arr[i] > max){
                max=arr[i];
            }
        }
        System.out.println("The largest number in the array is :" + max);
        
    }
    
}
