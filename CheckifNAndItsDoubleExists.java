public class CheckifNAndItsDoubleExists {
    
    public boolean checkIfExist(int[] arr) {

        for(int i = 0 ; i < arr.length ; i++){

            for(int j = 0 ; j < arr.length ; j++){

                if (arr[i] == 2*arr[j] && i != j) {

                    return true;
                    
                }

            }

        }


        return false;
        
    }


    public static void main(String[] args) {
        
        CheckifNAndItsDoubleExists cc = new CheckifNAndItsDoubleExists();

        int[] arr = {1,2,3,3,6,7};

        boolean doesExist = cc.checkIfExist(arr);

        System.out.println(doesExist);
    }
}
