package generalcode;

import java.util.HashMap;
import java.util.Map;

public class StringCount {
    public static void main(String[] args) {
        String str = "Count the characters in a String";
        Map<Character, Integer> charCount = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (charCount.containsKey(c)) {
                charCount.put(c, charCount.get(c) + 1);
            } else {
                charCount.put(c, 1);
            }
        }
        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            System.out.println("Character '" + entry.getKey() + "' appeared " + entry.getValue() + " times");
        }
        
        
        /*Map<Character, Long> charCount1 = str.chars()
                .mapToObj(c -> (char) c)
                .collect(HashMap::new,
                     (map, c) -> map.merge(c, 1L, Long::sum),
                     Map::putAll);
        
        System.out.println("*****************************");
        charCount1.forEach((c, count) -> 
        		System.out.println("Character '" + c + "' appeared " + count + " times"));*/
    }
    
}

