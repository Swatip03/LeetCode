
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class NumberOfStudentsUnableToEatLunch {

    

    
    
    public int countStudents(int[] students, int[] sandwiches) {

        Stack<Integer> st = new Stack<>();
        Queue<Integer> qu = new LinkedList<>();

        for(int i = 0 ; i < students.length  ; i++){

            qu.add(students[i]);
            
        }

        for(int j = sandwiches.length-1;  j >= 0 ; j--){     // Stack stores in reverse order

            st.push(sandwiches[j]);

        }

        int cnt = 0;         // for counting the cycles

        while (!qu.isEmpty()) {

            if (qu.peek().equals(st.peek())) {      // Students get the sandwich

                st.pop();
                qu.remove();
                cnt = 0;
                
            }
            else{               // If the stuent is unable to eat the sandwich

                qu.add(qu.remove());
                cnt++;
                
            }

            if (cnt == qu.size()) {         // If all students cycle without eating , break the loop

                break;
                
            }
            
        }


        return qu.size();

    }


    public static void main(String[] args) {
        
        NumberOfStudentsUnableToEatLunch nos = new NumberOfStudentsUnableToEatLunch();

        int[] students = {1,1,0,0};
        int[] sandwiches = {0,1,0,1};

        int ans = nos.countStudents(students, sandwiches);

        System.out.println(ans);

    }
}
