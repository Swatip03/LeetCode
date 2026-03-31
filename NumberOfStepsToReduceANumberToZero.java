public class NumberOfStepsToReduceANumberToZero {

    public int cnt = 0;
    
    public int numberOfSteps(int num) {

        if (num == 0) {

            return cnt;
            
        }

        
        if (num % 2 == 0) {

            cnt++;
            return numberOfSteps(num / 2);
            
        }else{

            cnt++;
            return numberOfSteps(num - 1);

        }
   
    }

    public static void main(String[] args) {

        NumberOfStepsToReduceANumberToZero nn = new NumberOfStepsToReduceANumberToZero();

        int num = 123;

        int steps = nn.numberOfSteps(num);

        System.out.println(steps);
        

    }
}
