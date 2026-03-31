public class CountTotalNumberOfColouredCells {
    
    public long coloredCells(int n) {

        long N = (long) n;

        long ans = (N*N) + ((N-1)*(N-1));
        return ans;
        
    }

    public static void main(String[] args) {
        
        CountTotalNumberOfColouredCells ct = new CountTotalNumberOfColouredCells();

        int n = 69675;
        long ans = ct.coloredCells(n);

        System.out.println(ans);


    }
}
