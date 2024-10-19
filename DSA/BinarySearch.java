public class BinarySearch {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9,10,11,23,32,45,56,67,68,69,89,90,91,95,99};
		int[] arr1 = {99,98,76,65,64,57,53,43,32,31,20,18,11,9,5,1,0,0};
		int target = 32;
		int idxAsc = searchBinary(arr,target);
		int idxDesc = searchBinary(arr1,target);
		System.out.println(arr.length + " " + idxAsc);
		System.out.println(arr[idxAsc]);
		System.out.println(arr1.length + " " + idxDesc);
		System.out.println(arr1[idxDesc]);
	}

	private static int searchBinary(int[] arr, int target) {
		int start = 0;
		int end = arr.length - 1;
		boolean isAsc = arr[start] < arr[end];
		
		while(start<=end) {
			int mid = (start + end)/2;
			if(arr[mid] == target) {
				return mid;
			}else if(isAsc) {
				if(arr[mid]>target) {
					end = mid -1;
				}else{
					start = mid+1;
				}
			}else {
				if(arr[mid]<target) {
					end = mid -1;
				}else{
					start = mid+1;
				}
			}	
		}
		return 0;
	}

}
