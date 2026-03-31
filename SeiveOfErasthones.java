public class SeiveOfErasthones {
    
    public int countPrimes(int n) {

        boolean[] primes = new boolean[n+1];

        int cnt = 0;

        for(int i = 2 ; i < n ; i++){

            if (primes[i] == false) {

                for(int j = 2*i ; j < n ; j+=i){

                    primes[j] = true;

                }

                cnt++; 
                
            }
        }

        return cnt;
    }


    public static void main(String[] args) {
        
        SeiveOfErasthones se = new SeiveOfErasthones();

        int n = 2;

        int ans = se.countPrimes(n);
        System.out.println(ans);
    }
}
