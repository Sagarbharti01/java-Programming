// import java.util.*;
public class javabasics{
 

    public static void check_palindrome(int number){  
    System.out.println("enter the nubmer to check palindrome");
    int org_number = number;
       int reverse = 0;
       while (number>0){
           int lastnum = number%10;
           reverse= reverse*10 + lastnum;
           number = number /10;}
          if (org_number == reverse) {  
           System.out.print("yes it is palindrome");
          }else {  
          System.out.print("not palindrome");
          }
        }
    public static void printSubarray(int numbers[]){
        int ts= 0;
        for(int i=0;i<numbers.length; i++){
            int start = i;
            for(int j=i ; j<numbers.length ; j++){
                int end = j; 
                for(int k=start;k<=end; k++){
                    System.out.print(numbers[k]+" ");
                }ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("total subarray = "+ts);
    }
   
    public static void main(String args[]){
      
      // check_palindrome(12113921);
      int numbers[] = {2,4,6,8,10};
      printSubarray(numbers);
    }      
}   
           
   
    
