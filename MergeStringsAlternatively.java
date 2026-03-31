public class MergeStringsAlternatively {
    
    public String mergeAlternately(String word1, String word2) {

        int m = word1.length();
        int n = word2.length();

        if ( m == n) {

            StringBuilder sb = new StringBuilder();
            
            int edx = 0;
            int odx = 0;

            for(int i = 0 ; i < m+n ; i++){

                if (i % 2 == 0) {

                    sb.append(word1.charAt(edx));
                    edx++;
                    
                }

                if (i % 2 != 0) {

                    sb.append(word2.charAt(odx));
                    odx++;
                    
                }

            }

            String str = sb.toString();

            return str;
            
        }


        else if ( m > n) {

            StringBuilder sb = new StringBuilder();

            int edx = 0;
            int odx = 0;

            int lenOfAlt = (m+n) - (m-n);

            for(int i = 0 ; i < lenOfAlt ; i++){

                if (i % 2 == 0) {

                    sb.append(word1.charAt(edx));
                    edx++;

                }

                
                if (i % 2 != 0) {

                    sb.append(word2.charAt(odx));
                    odx++;
                    
                }

            }

            // Rest part of the string word1 of length m

            for(int i = edx ; i < word1.length() ; i++){

                sb.append(word1.charAt(i));

            }


            String str = sb.toString();

            return str;


            
        }

        else{

            
            StringBuilder sb = new StringBuilder();

            int edx = 0;
            int odx = 0;

            int lenOfAlt = (m+n) - (n-m);

            for(int i = 0 ; i < lenOfAlt ; i++){

                if (i % 2 == 0) {

                    sb.append(word1.charAt(edx));
                    edx++;

                }

                
                if (i % 2 != 0) {

                    sb.append(word2.charAt(odx));
                    odx++;
                    
                }

            }

            // Rest part of the string word1 of length m

            for(int i = odx ; i < word2.length() ; i++){

                sb.append(word2.charAt(i));

            }


            String str = sb.toString();

            return str;


        }

        
    }

    public static void main(String[] args) {
        
        MergeStringsAlternatively ms = new MergeStringsAlternatively();

        String word1 = "ab";
        String word2 = "pqrs";

        String str = ms.mergeAlternately(word1, word2);

        System.out.println(str);
    }
}
