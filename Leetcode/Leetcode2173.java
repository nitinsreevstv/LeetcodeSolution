public class Leetcode2173 {
    /* 
2176. Count Equal and Divisible Pairs in an Array
Given a 0-indexed integer array nums of length n and an integer k, return the number of pairs (i, j) where 0 <= i < j < n, such that nums[i] == nums[j] and (i * j) is divisible by k.
*/
public static void main(String[] args){
    int[] nums = {3,1,2,2,2,1,3};
    int k = 2;
    System.out.println(countPairs(nums, k));
}
public static int countPairs(int[] nums, int k) {
    int pairs=0;
    for(int i=0;i<nums.length-1;i++){
        for(int j=i+1;j<nums.length;j++){
            if(nums[i]==nums[j]){
                int count=i*j;
                if(count%k==0){
                    pairs++;
                }
            }
        }
    }
    return pairs;
}

}
