public class FindTheHighestAltitude {
    public int largestAltitude(int[] gain) {

        int[] alt = new int[gain.length + 1];

        alt[0] = 0;

        for(int i = 1 ; i < alt.length ; i++){

            alt[i] = gain[i-1] + alt[i-1];

       }

        int highAlt = alt[0];

        for(int i = 0 ; i < alt.length ; i++){

            if (alt[i] > highAlt) {

                highAlt = alt[i];
                
            }

        }

        return highAlt;

        
    }

    public static void main(String[] args) {

        FindTheHighestAltitude ff = new FindTheHighestAltitude();
        
        int[] gains = {-4,-3,-2,-1,4,3,2};

        int highAlt = ff.largestAltitude(gains);

        System.out.println("The highest altitude is "+highAlt);
    }
}
