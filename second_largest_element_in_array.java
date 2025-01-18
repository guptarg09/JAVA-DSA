public class second_largest_element_in_array {
        public static void main(String[] args){
            int[] arr = {2, 5, 6, 2, 0, -2};
            int ans  = secondLargest(arr);
            System.out.println(ans);
            
        }
        public static int secondLargest(int[] arr){
            int large = Integer.MIN_VALUE;
            int secLarge = Integer.MIN_VALUE;
            for(int i=0 ; i<arr.length; i++){
                if(arr[i] > large){
                    secLarge = large;
                    large = arr[i];
                }
                if(arr[i] < large && arr[i] > secLarge){
                    secLarge = arr[i];
                }
            }
            return secLarge;
        }
    }
