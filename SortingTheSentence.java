public class SortingTheSentence {
    
    public String sortSentence(String s) {

        String[] str = s.split(" ");

        int[] seq = new int[str.length];

        // Finding the given sequence of the array

        for(int i = 0; i < str.length ; i++){

            seq[i] = str[i].charAt(str[i].length() - 1);
            
            str[i] = str[i].replace(str[i], str[i].substring(0, str[i].length()-1)); // Replacing is2 with is

        }


        // Sorting the string array

        for(int i = 0 ; i < seq.length ; i++){

            for(int j = 1 ; j < seq.length - i ; j++){

                if (seq[j-1] > seq[j]) {

                    int tem = seq[j];
                    seq[j] = seq[j-1];
                    seq[j-1] = tem;

                    String temp = str[j];
                    str[j] = str[j-1];
                    str[j-1] = temp;
                    
                }
            }
        }

        // Converting the string array to the string object

        StringBuilder sb = new StringBuilder();

        for(int i = 0 ; i < str.length ; i++){

            if (i != str.length-1) {

                sb.append(str[i]+" ");
                
            }
            else{

                sb.append(str[i]);

            }


        }


        String st = sb.toString();


        return st;

    }


    public static void main(String[] args) {
        
        SortingTheSentence ss = new SortingTheSentence();

        String s = "Myself2 Me1 I4 and3";

        String ans = ss.sortSentence(s);

        System.out.println(ans);
    }
}
