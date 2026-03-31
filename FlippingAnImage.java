public class FlippingAnImage {
    public int[][] flipAndInvertImage(int[][] image) {

        int[][] resultImage = new int[image.length][image[0].length];

        for(int i = 0 ; i < image.length ; i++){

            int[] arr = new int[image[i].length];

            for(int j = 0 ; j < image[i].length ; j++){

                arr[j] = image[i][image[i].length - 1 - j];

                if (arr[j] == 0) {

                    arr[j] = 1;
                    
                }
                else{

                    arr[j] = 0 ; 

                }

                resultImage[i][j] = arr[j];

            }

        }

        return resultImage;
        
    }


    public static void main(String[] args) {
        
        FlippingAnImage ff = new FlippingAnImage();

        int[][] image = {
                        {1,1,0},
                        {1,0,1},
                        {0,0,0}

                        };

       int[][] resultImage = ff.flipAndInvertImage(image);

        
        for (int i = 0; i < resultImage.length; i++) {   

            for (int j = 0; j < resultImage[i].length; j++) { 

             System.out.print(resultImage[i][j] + " ");    

            }
            System.out.println();                        
        }
    }

}

