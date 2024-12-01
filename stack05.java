import java.util.Stack;

public class stack05 {
    // reverse of stack element.
    public static void PushAtBottom(Stack<Integer> s, int data){
        while (s.isEmpty()) {
             s.push(data);
            return ;
        }
        
        int top=s.pop();
        PushAtBottom(s,data);
        s.push(top);
    }
    static void reverseStack(Stack<Integer> s){
        while (s.isEmpty()) {
            return ;
        }
 
        int top=s.pop();
        reverseStack(s);
        PushAtBottom(s,top);
    }
    public static void main(String[] args) {
        Stack<Integer> s= new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        reverseStack(s);
        // PushAtBottom(s,4);
        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }
}
