public class MaximumPopulationYear {

    public int maximumPopulation(int[][] logs) {

        int year = logs[0][0];

        for(int i = 0 ; i < logs.length -1 ; i++){

            for(int j = 0 ; j < logs[i].length - 1; j++){

                if (logs[i][0] >= logs[i+1][0] && logs[i][0] < logs[i+1][j+1]) {

                    year = logs[i][0];
                    
                }

            }

        }


        return year;
        
    }


    public static void main(String[] args) {

        MaximumPopulationYear mm = new MaximumPopulationYear();
        
        int[][] logs = {
                       {1950,1961},
                       {1960,1971},
                       {1970,1981}
                        };

        int year = mm.maximumPopulation(logs);
        
        System.out.println("The maximum population year is :: "+year);
    }
}
