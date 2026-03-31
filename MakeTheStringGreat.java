public class MakeTheStringGreat {

    public boolean isGood(StringBuilder sb){

        boolean isGood = true;
        
        

        for(int i = 0 ; i < sb.length()-1 ; i++){

            String a = sb.charAt(i) + "";
            String b = sb.charAt(i+1) + "";

            if (a.equalsIgnoreCase(b)  && (97 <= sb.charAt(i) && sb.charAt(i) >= 122) && (65 <= sb.charAt(i+1) && sb.charAt(i+1) >= 90)) {
                
            }

            

            
        }
    }
    
    public String makeGood(String s) {


        
    }
}
