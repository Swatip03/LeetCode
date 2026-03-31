public class GreatNumOfCandies {
    
    boolean[] kidsWithCandies(int[] candies , int extraCandies ){


        boolean[] result = new boolean[candies.length];

        // Step-1 ---> Finding the maximum candy in the given candies array

        int maxCandy = candies[0];

        for(int i = 0 ; i < candies.length ; i++){

            if (candies[i] > maxCandy) {

                maxCandy = candies[i];
                
            }

        }
        
        //Step 2--> Compare if each kid's candy plus extra is greater than the maxCandy of the array

        for(int i = 0 ; i < result.length ; i++){

            // Just check if the current kid's candies + extraCandies is greater than or equal to maxCandies

            if (candies[i] + extraCandies >= maxCandy) {

                result[i] = true;
                
            }
            else{

                result[i] = false;

            }

        }





        // for(int i = 0 ; i < candies.length ; i++){

        //     candies[i] = candies[i] + extraCandies;

        //     int maxCandies = candies[i];

        //     boolean greatNumOfCandies = false;

        //     for(int j = 0 ; j < candies.length ; j++){

                

        //         for(int k = 0 ; k < candies.length ; k++){

        //             if (candies[k] >= maxCandies) {

        //                 maxCandies = candies[k];
                        
        //             }

        //         }

        //         if (maxCandies == candies[i]) {

        //             greatNumOfCandies = true;
                    
        //         }
        //         else{
                    
        //             greatNumOfCandies = false;

        //         }

        //     }

        //     result[i] = greatNumOfCandies;

            

        // }

        return result;

    }

    public static void main(String[] args) {
        
        int[] candies = {2,3,5,1,3};

        int extraCandies = 3;

        GreatNumOfCandies g = new GreatNumOfCandies();

        boolean[] result = g.kidsWithCandies(candies, extraCandies);


        System.out.print("[");

        for(int i = 0 ; i < result.length ; i++){

            System.out.print(result[i]);

            if (i < result.length - 1) {

                System.out.print(",");
                
            }

        }

        System.out.print("]");
    }
}
