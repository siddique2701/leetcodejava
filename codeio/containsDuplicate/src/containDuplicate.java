import java.util.HashMap;

public class containDuplicate {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4}; // Example input
        boolean result = containsDuplicate(nums);
        System.out.println(result); // Output: true
    }

    public static boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Boolean> map = new HashMap<>();
        for(int i: nums) {
            if (map.containsKey(i))
                return true;
            map.put(i,true);
        } return false;
    }
}



