import java.util.HashMap;
import java.util.*;

public class SortCharactersByFrequencyInAString {
    public String frequencySort(String s) {
        int n = s.length();
        HashMap<Character,Integer> freqMap = new HashMap<>();

        //filling the hashmap
        for(int i = 0 ; i < n ; i++){
            char ch = s.charAt(i);
            if (freqMap.containsKey(ch)) {
                freqMap.put(ch, freqMap.get(ch)+1);
            }else{
                freqMap.put(ch, 1);
            }
        }

        //Creating a maxheap for the freqMap
        PriorityQueue<Map.Entry<Character,Integer>> maxHeap = new PriorityQueue<>((a,b) -> b.getValue() - a.getValue());

        //Adding all the entries of freqmap into the maxheap
        maxHeap.addAll(freqMap.entrySet());

        StringBuilder sb = new StringBuilder();

        while (!maxHeap.isEmpty()) {
            Map.Entry<Character,Integer> entry = maxHeap.poll();
            char ch = entry.getKey();
            int freq = entry.getValue();

            for(int i = 0 ; i < freq ; i++){
                sb.append(ch);
            }
        }

        
        return sb.toString();
                
    }
}
