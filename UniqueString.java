import java.util.*;

public class UniqueString {

    public static int UniqueIndex(String s) {
        int index = -1;
        Map<Character, Integer> charFreq = new HashMap<>();

        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            charFreq.put(ch, charFreq.getOrDefault(ch, 0) + 1);
        }

        
        for (int i = 0; i < s.length(); i++) {
            if (charFreq.get(s.charAt(i)) == 1) {
                index = i;
                break;
            }
        }

        return index;
    }

    public static void main(String[] args) {
        System.out.println(UniqueIndex("leetcode")); 
        System.out.println(UniqueIndex("loveleetcode")); 
        System.out.println(UniqueIndex("aabb")); 
    }
}

