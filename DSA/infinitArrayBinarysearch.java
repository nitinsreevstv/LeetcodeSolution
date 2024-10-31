public class infinitArrayBinarysearch {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,23,24,25,26,27,29,30,32,33,34,35,37,38,39,40,44,45,48};
        int target = 23;
        int position = searchInChunks(arr,target);
        System.err.println(position);
    }
    public static int searchInChunks(int[] arr, int target){
        int[] pos = checkPos(arr, target);
        int start = pos[0];
        int end = pos[1];
        while(start<=end){
            int mid = start + (end - start) / 2;
            if(arr[mid] == target){
                return mid;
            }else if(target > mid){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }

        return -1;
    }
    private static int[] checkPos(int[] arr, int target){
        int start = 0;
        int end = 1;


        while (end < arr.length && arr[end] < target) {
            start = end;
            end = Math.min(arr.length - 1, end * 2); // Ensure end does not exceed array length
        }

        return new int[]{start, end};
    }
}
