public class FloornumberBinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,9,13,24,33,36,56,77,87,98};
        int target = 22;

        int start = 0, end = arr.length - 1;
        while(start<=end){
            int mid = (start + end) / 2;
            if(arr[mid] == target){
                System.err.println(arr[mid]);
            }else if(arr[mid]>target){
                end = mid - 1;
            }else{
               start = mid + 1;
            }   
        }
        System.out.println(arr[end]);
    }
}
