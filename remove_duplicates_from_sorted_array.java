import java.util.Arrays;

public class remove_duplicates_from_sorted_array_method1 {
    public static void main(String args[]){
        int[] arr = {2, 2, 5, 7, 7, 7, 9, 9, 9, 9, 10, 10};
        int[] ans = removeDuplicate(arr);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] removeDuplicate(int[] originalArray){

        int[] new_array = new int[11];
        new_array[0] = originalArray[0];
        int x=0;
        for(int j=1; j<originalArray.length; j++){
            if (originalArray[j] != new_array[x]) {
                x++;    
                new_array[x] = originalArray[j];
            }
        }
        return Arrays.copyOf(new_array, x+1);
    }
}
