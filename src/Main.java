import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        for (Integer num : nums) {
            if (num % 2 == 1) {
                System.out.println(num);
            }
        }
        List<Integer> nums1 = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        Set<Integer> set = new TreeSet<>();
        for (Integer num1 : nums1) {
            if (num1 % 2 == 0) {
                set.add(num1);
            }
        }
        System.out.println(set);

        List<String> strings = new ArrayList<>(List.of("один", "один", "два","два", "два", "три", "три", "три"));
        Set<String> set1 = new HashSet<>(strings);
        System.out.println(set1);

        List<String> strings1 = new ArrayList<>(List.of("один", "один", "два","два", "два", "три", "три", "три"));
        Map<String, Integer> map = new HashMap<>();
        for (String string : strings1) {
            if (!map.containsKey(string)){
                map.put(string, 1);
            } else {
                map.put(string, map.get(string) + 1);
            }
        }
        System.out.println(map.values());
    }
}