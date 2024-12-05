import java.util.*;

public class TreeSetExample {  
        public static void main(String[] args) {
        int[] arr = {2, 3, 4, 4, 5, 6, 3, 2, 34, 23, 22, 32, 56, 43, 3, 4, 11};
        System.out.println("Sort the unique values only:");  
        sortedSet(arr);
    }

    private static void sortedSet(int[] arr) {
        TreeSet<Integer> tre = new TreeSet<>(); 
        for (int i = 0; i < arr.length; i++) {
            tre.add(arr[i]);
        }
        System.out.println(tre);
    }
}
