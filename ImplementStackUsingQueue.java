import java.util.*;

public class ImplementStackUsingQueue {

    private Queue<Integer> qu;

    
    
    
    
    public void push(int x) {

        int s = qu.size();
        qu.add(x);

        for(int i = 1 ; i < s ; i++){

            qu.add(qu.peek());

            qu.remove();
            
        }
        
    }
    
    public int pop() {

        if (qu.isEmpty()) {
            throw new RuntimeException("Stack Underflow");
        }

        return qu.remove();
        
    }
    
    public int top() {

        if (qu.isEmpty()) {
            throw new RuntimeException("Stack is Empty");
        }

        return qu.peek();
        
    }
    
    public boolean empty() {

        return qu.isEmpty();
        
    }
}
