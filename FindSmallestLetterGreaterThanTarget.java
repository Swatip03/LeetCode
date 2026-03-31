public class FindSmallestLetterGreaterThanTarget {

    
        public char nextGreatestLetter(char[] letters, char target) {
            
            int low = 0;
            int high = letters.length - 1;
            
            // If the target is greater than or equal to the last character, return the first character.
            if (target >= letters[high]) {
                return letters[0];
            }
            
            // Binary search
            while (low <= high) {
                int mid = (low + high)/2;
                
                if (letters[mid] > target) {

                    high = mid - 1;

                } else {

                    low = mid + 1;
                    
                }
            }
            
            // 'low' will point to the smallest character greater than target
            return letters[low];


            
     
    

















    
    // public char nextGreatestLetter(char[] letters, char target) {

    //     int start = 0 ;
    //     int end = letters.length - 1;

    //     while (start <= end) {

    //         int mid = (start + end)/2;

    //         if (letters[mid] > target && ((mid == 0) || (letters[mid - 1] <= target))) {

    //             return letters[mid];
                
    //         }
    //         else if (letters[mid] < target) {

    //             start = mid + 1;
                
    //         }
    //         else if (letters[mid] > target) {

    //             end = mid - 1;
                
    //         }
    //         for(int i = 0 ; i < letters.length ; i++){

    //             if (letters[mid] == target && (letters[i] > letters[mid] )) {

    //                 return letters[i];
                    
    //             }
    //             else if (letters[mid] == target  ) {

    //                 return letters[0];
                    
    //             }

    //         }
            
    //     }

        }
     

    public static void main(String[] args) {
        
        FindSmallestLetterGreaterThanTarget ff = new FindSmallestLetterGreaterThanTarget();

        char[] letters = {'c','f','j'};
        char target = 'c';

        char nextGreatNum = ff.nextGreatestLetter(letters, target);

        System.out.println(nextGreatNum);
    }
}
