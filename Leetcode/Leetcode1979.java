public class Leetcode1979 {
    public static void main(String[] args){
        int[] arr = {2,5,6,9,10};
        System.out.println(findGCD(arr));
    }
    public static int findGCD(int[] nums) {
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            for(int i : nums){
                if(i > max){
                    max = i;
                } if(i < min){
                    min = i;
                }
            } 
            while(min > 1){
            if(max%min==0){
               return min;
            }else{
                int temp = max % min;
                max = min;
                min = temp;
            }
            }
            return 1; 
    }
}
