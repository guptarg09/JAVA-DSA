public class Largest_Element_In_Array {

    public static void main(String args[]) {
        int[] arr = {2, -4, 49, 0,35, 5};
        // int ans = largest(arr);
        System.out.println(largest(arr));
    }
    public static int largest(int[] arr){
        if (arr.length == 0) {  
            return -1;
        }
        int bigItem = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i] > bigItem){
                bigItem = arr[i];
            }
        }
        return bigItem;
    }
}

