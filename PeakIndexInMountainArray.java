public class PeakIndexInMountainArray {
    
    public int peakIndexInMountainArray(int[] arr) {

        int start = 0;
        int end = arr.length - 1;

        while (start < end) {

            int mid = start + (end - start)/2;

            if (arr[mid] > arr[mid + 1]) {

                // You are in decreasing part of the arrray
                //This may be the answer but look in the left
                // This is why end is not equal to mid - 1


                end = mid;
                
            }else{
                // You are in ascending part of the array

                start = mid + 1;// bcz we know that arr[mid+1] >arr[mid]

            }
            
        }

        //At last ,start == end and pointing to largest number because of the above 2 checks 
        // Start and end always trying to find out the max element in the above two cheks 
        // Hence when they are pointing towards to the one element that is the max one bcz thats what the check say

        return start;        // you can use end as well



































        // int start = 0;
        // int end = arr.length;

        // while (start <= end) {

        //     int mid = start + (end - start)/2;

        //     if (arr[mid] > arr[mid + 1] && arr[mid - 1] < arr[mid]) {

        //         return mid;
                
        //     }
        //     if ( mid == 0 || arr[mid] > arr[mid - 1] ) {

        //         start = mid + 1;
                
        //     }

        //     if ( mid != 0 && arr[mid - 1] > arr[mid] ) {

        //         end = mid - 1;
                
        //     }


            
        // }
        

        // return -1;
    }


    public static void main(String[] args) {
        
        PeakIndexInMountainArray pp = new PeakIndexInMountainArray();

        int[] arr = {0,3,5,12,2};

        int index = pp.peakIndexInMountainArray(arr);

        System.out.println("The peak is present at : "+index);
    }
}
