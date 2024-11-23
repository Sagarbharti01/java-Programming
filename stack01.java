import java.util.ArrayList;

public class stack01 {
    // create stack using arraylist...
    public static class Stack{
        static ArrayList<Integer> list = new ArrayList<>();
        
        // isEmpty
        public static boolean isEmpty(){
            return list.size()==0;
        }

        // push
        public static void push(int data){
            list.add(data);
        }
        // pop
        public static int pop(){
            if (isEmpty()) {
                return -1;
            }
            int top =list.get(list.size() -1);
            list.remove(list.size()-1);
            return top;
        }
        // peek
        public static int peek() {
            if(isEmpty()){
                return -1;
            }
            int top=list.get(list.size()-1);
            return top;
        }
    }
    public static void main(String[] args) {
        Stack ss= new Stack();
        ss.push(1);
        ss.push(2);
        ss.push(3);
         while(!ss.isEmpty()){
            System.out.println(ss.peek());
            ss.pop();
         }
    }
}
