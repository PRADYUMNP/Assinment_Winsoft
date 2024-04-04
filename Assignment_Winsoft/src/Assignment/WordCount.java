package Assignment;

import java.util.HashMap;

public class WordCount {
    public static void main(String[] args) {
        String sentence = "Hello world this is a sample sentence to count the number of words in a string using HashMap";

        HashMap<String, Integer> wordCountMap = new HashMap<>();

        String[] words = sentence.split("\\s+");

        for (String word : words) {
            word = word.toLowerCase(); 
            if (wordCountMap.containsKey(word)) {
                wordCountMap.put(word, wordCountMap.get(word) + 1);
            } else {
                
                wordCountMap.put(word, 1);
            }
        }

       
        for (String word : wordCountMap.keySet()) {
            System.out.println(word + ": " + wordCountMap.get(word));
        }
    }
}
