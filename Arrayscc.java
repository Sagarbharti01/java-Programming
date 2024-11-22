public class Arrayscc {   
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
       

        //maxSubArraySum
     public static void maxSubArraySum_1(int []numbers){
       int  maxSum = Integer.MIN_VALUE;
    //    int currSum = 0;

        for(int i=0;i<numbers.length;i++){
            int start=i;
            for(int j=i; j<numbers.length;j++){
                int end = j;
                int currSum = 0;
                for (int  k=start;k<=end ;k++){
                    currSum = currSum+numbers[k];
                }System.out.println(currSum);
                if (maxSum<currSum) {
                    maxSum=currSum;

                }
            }
       }
       System.out.println("max sum = "+maxSum);
     }

     //max sum by prefix approach
     public static void maxSubArraySum_2(int numbers[]){
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        int prefix[] = new int[numbers.length];

        prefix[0] = numbers[0];
        //FOR CALCULATION OF PREFIX ARRAY
        for(int i=1; i<prefix.length;i++){
            prefix[i] = prefix[i-1] +numbers[i];
        }

        for(int i=0; i<numbers.length; i++){
            int start = i;
            for(int j=i; j<numbers.length; j++){
                int end = j;
                currSum = start == 0 ? prefix[end] : prefix[end] - prefix[i-1];

                if (maxSum < currSum) {
                    maxSum = currSum;
                }
            }
        }
        System.out.println("max sum = "+ maxSum);
     }

     // kadanes approach
     public static void kadanes(int numbers[]){
        int maxSum =Integer.MIN_VALUE;
        int currSum = 0;
        
        for(int i=0; i<numbers.length; i++){
            currSum += numbers[i];
            if (currSum<0) {
                currSum = 0;                
            }
           maxSum = Math.max(currSum,maxSum) ;
        }
        System.out.println("max sum = "+maxSum);
     }
        public static void main(String args[]){
        int numbers[] = {-2 ,-3, 4 ,-1 ,-2 ,1 ,5 ,-3};
             //printSubarray(numbers);
            //maxSubArraySum_1(numbers);
           // maxSubArraySum_2(numbers);
          // kadanes(numbers);
        }      
    }   

