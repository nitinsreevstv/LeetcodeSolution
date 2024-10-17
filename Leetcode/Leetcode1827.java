class Leetcode1827 {
    public static void main(String[] args){
            int[] num = {1,5,2,4,1};
            System.out.println(minOperations(num));
    }
    public static int minOperations(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        
        int count = 0;
        for (int i = 1; i < nums.length; i++) {
            int j = i - 1;
            if (nums[j] >= nums[i]) {
                count += (nums[j] + 1 - nums[i]);  
                nums[i] = nums[j] + 1; 
            }
        }
        return count;
    }
}
