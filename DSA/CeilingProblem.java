public class CeilingProblem {
    public static void main(String[] args){
        int[] arr = {2,4,5,14,19,24,29,33};
        int target = 23;
        // find the ceiling value :- Ceiling value is something which is smallest greater number or equal to the target value
        System.out.println(ceilingNumber(arr, target));

    }
    public static int ceilingNumber(int[] arr, int k){
       int start = 0;
       int end = arr.length - 1;
       while(start<=end){
        int mid = (start + end) / 2;
        if(arr[mid] == k){
            return k;
        }else if(arr[mid] > k){
            end = mid -1;
        }else{
            start = mid + 1;
        }
       }
        return arr[start];
    }
}
