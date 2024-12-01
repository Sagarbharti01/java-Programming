import java.util.Stack;

public class stack06 {
    public static void stockSpan(int stock[], int span[]){
         Stack<Integer> p= new Stack<>();
         span[0]=1;
         p.push(0);
        for(int i=1; i<stock.length; i++){
            int currStock= stock[i];
            while (!p.isEmpty()&& currStock>=stock[p.peek()]) {
                p.pop();
            }
            if (p.isEmpty()) {
                span[i]=i+1;
            }else{
                int prevhigh=p.peek();
                span[i]=i-prevhigh;
            }
            p.push(i);
        }
    }
    public static void main(String[] args) {
        int stock[]={100,80,60,70,60,85,100};
        int span[]=new int[stock.length];
        stockSpan(stock, span);
        for(int i=0; i<stock.length;i++){
            System.out.println(span[i]);
        }
    }
}
