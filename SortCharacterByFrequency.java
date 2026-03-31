import java.util.HashMap;

public class SortCharacterByFrequency {
    
    public String frequencySort(String s) {

        char[] chArr = s.toCharArray();

        HashMap<Character,Integer> hmap = new HashMap<>();

        for(int i = 0 ; i < chArr.length ; i++){

            if (!hmap.containsKey(chArr[i])) {

                hmap.put(chArr[i], 1);
                
            }
            else{

                hmap.put(chArr[i], hmap.get(chArr[i])+1);

            }

        }

        StringBuilder sb = new StringBuilder();

        int maxFreq = 0;

        for(var ent : hmap.entrySet()){

            if (maxFreq < ent.getValue()) {

                maxFreq = ent.getValue();
                
            }

        }

        // Now making the string 

        for(var ent : hmap.entrySet()){



        }
        
        
        
    }

    public static void main(String[] args) {
        
        SortCharacterByFrequency sc = new SortCharacterByFrequency();

        String s = "Aaabbb";
        String ans = sc.frequencySort(s);

        System.out.println(ans);
    }
}
