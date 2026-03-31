public class DetermineIfTheHalfStringsAreAlike {
    
    public boolean halvesAreAlike(String s) {

        int halfLen = s.length()/2;

        StringBuilder sb1 = new StringBuilder();

        for(int i = 0 ; i < halfLen ; i++){

            sb1.append(s.charAt(i));

        }

        String a = sb1.toString();

        int cnt1 = 0;

        for(int i = 0 ; i < a.length() ; i++){

            if (a.charAt(i) == 'a' || a.charAt(i) == 'A') {

                cnt1++;
                
            }

            
            if (a.charAt(i) == 'e' || a.charAt(i) == 'E') {

                cnt1++;
                
            }

            
            if (a.charAt(i) == 'i' || a.charAt(i) == 'I') {

                cnt1++;
                
            }

            
            if (a.charAt(i) == 'o' || a.charAt(i) == 'O') {

                cnt1++;
                
            }

            
            if (a.charAt(i) == 'u' || a.charAt(i) == 'U') {

                cnt1++;
                
            }


        }

        
        StringBuilder sb2 = new StringBuilder();

        for(int i = halfLen ; i < s.length() ; i++){

            sb2.append(s.charAt(i));

        }

        String b = sb2.toString();

        int cnt2 = 0;

        for(int i = 0 ; i < b.length() ; i++){

            if (b.charAt(i) == 'a' || b.charAt(i) == 'A') {

                cnt2++;
                
            }

            
            if (b.charAt(i) == 'e' || b.charAt(i) == 'E') {

                cnt2++;
                
            }

            
            if (b.charAt(i) == 'i' || b.charAt(i) == 'I') {

                cnt2++;
                
            }

            
            if (b.charAt(i) == 'o' || b.charAt(i) == 'O') {

                cnt2++;
                
            }

            
            if (b.charAt(i) == 'u' || b.charAt(i) == 'U') {

                cnt2++;
                
            }


        }


        if (cnt1 == cnt2) {

            return true;
            
        }


        return false;
        
    }


    public static void main(String[] args) {
        
        DetermineIfTheHalfStringsAreAlike dd = new DetermineIfTheHalfStringsAreAlike();

        String s = "book";

        boolean ans = dd.halvesAreAlike(s);

        System.out.println(ans);
    }
}
