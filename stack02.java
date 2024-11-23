public class stack02 {
    // stack using linkedlist 
    public static class node {
        int data ;
        node  next;
         node(int data){
            this.data=data;
            this.next=null;
         }
    }

    static class stack{
        // check stack is empty or not
        public static node head;
        public static boolean isEmpty(){
           return head==null;
            
        }
        // push
        public static void push(int data){
            node newnn=new node(data);
            if (head==null) {
               head=newnn;
               return
            }
            newnn.next=head;
            head=newnn;
        }
        // pop
        public static int pop(){
            if (isEmpty()) {
             return -1;
            }
           int top=head.data;
            head=head.next;
            return top;
        }
        // peak
        public static int peek(){
            if (isEmpty()) {
                return -1;
               }
            return head.data;
        }


    }
    public static void main(String[] args) {
        stack s =new stack();
        s.push(3);
        s.push(2);
        s.push(1);
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
         }
    }
}
