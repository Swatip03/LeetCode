import java.util.HashSet;

public class RabbitsInForest {
    
    public int numRabbits(int[] answers) {

        HashSet<Integer> set = new HashSet<>();

        for(int i = 0 ; i < answers.length ; i++){

            set.add(answers[i]);

        }

        int ans = 0;

        for(int ent : set){

            ent = ent + 1;
            ans = ans + ent;

        }

        return ans;
        
    }

    public static void main(String[] args) {

        RabbitsInForest rif = new RabbitsInForest();
        
        int[] answers = {1,0,1,0,0};

        int ans = rif.numRabbits(answers);

        System.out.println(ans);
    }
}
