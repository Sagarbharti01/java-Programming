import java.util.*;

public class stack03 {
    static String reverseString(String str){
        Stack<Character> ss= new Stack<>();
        int i=0;
        while (i<str.length()) {
           ss.push(str.charAt(i)) ;
           i++;
        }
        StringBuilder result=new StringBuilder("");
        while (!ss.isEmpty()) {
            char curr=ss.pop();
            result.append(curr);
        }
        return result.toString();
    }
    public static void main(String[] args) {
        String str= "abc";
        String result=reverseString(str);
        System.out.println(result);
    }
}
