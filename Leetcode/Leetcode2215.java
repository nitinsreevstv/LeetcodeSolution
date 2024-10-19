import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Leetcode2215 {
    public static void main(String[] args) {
        int[] nums1 ={1,2,3,3};
        int[] nums2 = {1,1,2,2};
        System.out.println(findDifference(nums1,nums2));
    }
    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        
        for (int num : nums1) {
            set1.add(num);
        }
        for (int num : nums2) {
            set2.add(num);
        }
        List<Integer> answer1 = new ArrayList<>(set1);
        List<Integer> answer2 = new ArrayList<>(set2);
        
        answer1.removeAll(set2);
        
        answer2.removeAll(set1);
        
        List<List<Integer>> result = new ArrayList<>();
        result.add(answer1);
        result.add(answer2);
        
        return result;    
}
}
