public class MergeTwoSortedArrays {

    
    
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        for(int i = 0 ; i < (m+n) - m ; i++){

            nums1[i+m] = nums2[i];


        }


        // Sorting the merged array

        for(int i = 0 ; i < nums1.length ; i++){

            for(int j = 1 ; j < nums1.length - i ; j++){

                if (nums1[j] < nums1[j-1]) {

                    int temp = nums1[j];
                    nums1[j] = nums1[j-1];
                    nums1[j - 1] = temp;
                    
                }

            }

        }
        
    }

    

    
    public static void displaySortedArr(int[] arr){

        System.out.print("[");

        for(int i = 0 ; i < arr.length ; i++){

            System.out.print(arr[i]);

            if (i < arr.length - 1) {

                System.out.print(",");
                
            }

        }

        System.out.print("]");

    }

    public static void main(String[] args) {
        
        MergeTwoSortedArrays mm = new MergeTwoSortedArrays();

        int[] nums1 = {0};
        int[] nums2 = {1};

        int m = 0;
        int n = 1;

        mm.merge(nums1, m, nums2, n);

        displaySortedArr(nums1);

        
    }
}
