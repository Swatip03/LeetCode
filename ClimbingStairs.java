public class ClimbingStairs {
    

    public int climbStairs(int n) 

        return helpr(n);


        
    }

    public int helpr(int idx)
        if (idx == 0) {

            return 1;
            
        }

        if (idx < 0) {

            return 0;
            
        }

        int step1 = helpr(idx-2);

        int step2 = helpr(idx-1);

        return step1+step2;



    }

    public static void main(String[] args) {

        ClimbingStairs cs = new ClimbingStairs();
        
        int n = 3;

        int ans = cs.climbStairs(n);

        System.out.println(ans);
    }
}
