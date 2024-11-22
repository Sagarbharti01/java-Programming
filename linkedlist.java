public class linkedlist {


    static class mode {
        int data ;
        mode next;
        public   mode(int data){
            this.data= data;
            this.next= null;

        }  
    }  
    public static mode head;
    public static mode tail; 
        public static  void addFirst(int data){
            mode newNode= new mode(data);
            if(head==null) {
                head=tail=newNode;
                return;
            }
            newNode.next=head;
            head=newNode;
             
        }

        public static void print() {
            mode temp = head;

            while(temp!=null) {
                System.out.print(temp.data + "->");
                temp = temp.next;
            }
            System.out.println("null");
        }
        
        public static void addlast(int data){
            mode newNode =new mode(data);
            if (head==null) {
                head=tail=newNode;
                return ;
            }
            tail.next=newNode;
            tail=newNode;
        }
    
    public static void main(String[] args) {
         addFirst(2);
         addFirst(1);
         addlast(3);
         addlast(4);
         addlast(5);
         print();
         
    }
}
