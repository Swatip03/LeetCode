import java.util.HashSet;

public class LetterTilePossibilities {

    public void helpr(String s , int idx , HashSet<String> set, StringBuilder sb){

        
        if (idx >= s.length() ){
    
            set.add(sb.toString());     
            return;

        }

        sb.append(s.charAt(idx)+"");
        helpr(s,idx+1,set,sb);  // Take

        sb.deleteCharAt(sb.length()-1);
        helpr(s,idx+1,set,sb);   // Not take
    }

    public int numTilePossibilities(String tiles) {

        int idx = 0;
        HashSet<String> set = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        
        helpr(tiles, idx, set, sb);
    
        int ans = set.size();
        
        return ans;
    }

    public static void main(String[] args) {
        
        LetterTilePossibilities lt = new LetterTilePossibilities();

        String tiles = "AAABBC";

        int ans = lt.numTilePossibilities(tiles);

        System.out.println(ans)
    }

    

}
