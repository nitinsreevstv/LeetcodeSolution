import java.util.HashSet;
import java.util.Set;

public class Leetcode2442 {
    public static void main(String[] args) {
        int[] nums = {1,13,10,12,31};
        System.err.println(countDistinctIntegers(nums));
    }
    public static int countDistinctIntegers(int[] nums) {
         Set<Integer> set1 = new HashSet<>();
         for(int num : nums){
            set1.add(num);
            set1.add(reverse(num));
        }
        return set1.size();
    }
    private static int reverse(int n){
        int ans = 0;
        while(n>0){
            ans = ans * 10 + n%10;
            n = n/10;
        }
        return ans;
    }
}
