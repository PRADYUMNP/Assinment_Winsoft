package Assignment;

import java.util.HashMap;

public class DuplicateCharacters {
    public static void main(String[] args) {
        String str = "hello world";

        HashMap<Character, Integer> charCountMap = new HashMap<>();

        str = str.toLowerCase();

        for (char ch : str.toCharArray()) {
            if (ch != ' ') { 
                if (charCountMap.containsKey(ch)) {
                    charCountMap.put(ch, charCountMap.get(ch) + 1); 
                } else {
                    charCountMap.put(ch, 1); 
                }
            }
        }

     
        System.out.println("Duplicate characters in the string '" + str + "':");
        for (char ch : charCountMap.keySet()) {
            if (charCountMap.get(ch) > 1) {
                System.out.println(ch + " - Count: " + charCountMap.get(ch));
            }
        }
    }
}
