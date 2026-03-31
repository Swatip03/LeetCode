public class RobotReturnToOrigin {
    
    public boolean judgeCircle(String moves) {

        int cntLR = 0;
        int cntUD = 0;

        for(int i = 0 ; i < moves.length() ; i++){

            if (moves.charAt(i) == 'L') {

                cntLR--;
                
            }

            if (moves.charAt(i) == 'R') {

                cntLR++;
                
            }

            if (moves.charAt(i) == 'U') {

                cntUD++;
                
            }

            if (moves.charAt(i) == 'D') {

                cntUD--;
                
            }

        }


        if (cntLR == 0 && cntUD == 0) {

            return true;
            
        }

        else{

            return false;

        }
        
    }


    public static void main(String[] args) {
        

        RobotReturnToOrigin ro = new RobotReturnToOrigin();

        String moves = "LL";

        boolean ans = ro.judgeCircle(moves);

        System.out.println(ans);
    }
}
