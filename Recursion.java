import java.util.Arrays;
public class Recursion {
    public static void main(String[] args){
        // R0_demo(0); // print 0 to N
        // R1_demo(1,3); // print name N times
        // R2_demo(1,4);  // print 1 to N
        // R3_demo(4,4); // print from N to 1
        // R4_demo(1,4); // print from N to 1 by Bracktracking
        // R5_demo(3,0); // print the sum from N to 1 by Parameterized
        // System.err.println(R6_demo(3)); // print the sum from N to 1 by Functional like breaking the problem
        // System.err.println(R7_demo(5)); // print the product from N to 1 Functional
         
        // int[] arr={8,7,4,3,2,1};
        // R1_Reversing_The_Array(arr,0,arr.length-1); //Reversing the array 
        // System.out.println(Arrays.toString(arr));

        // R2_Palindrome_Or_Not("121213"); // palindrome or not

        System.out.println(R3_Fibonaci(0,1,10)); // multiply recursive calls
 
    }

    static void R0_demo(int num){
        if(num==4) return;
        System.out.print(num+" ");
        R0_demo(num+1);
    }

    static void R1_demo(int i,int n){
        if(i>n) return;
        System.out.println("Ab devilliers");
        R1_demo(i+1,n);
    }

    static void R2_demo(int i,int n){
        if(i>n) return;
        System.out.print(i+" ");
        R2_demo(i+1,n);
    }

     static void R3_demo(int i,int n){
        if(i<1) return;
        System.out.print(i+" ");
        R3_demo(i-1,n);
    }
       
    static void R4_demo(int i,int n){
        if(i>n) return;
        R4_demo(i+1,n);
        System.out.print(i+" ");
    }

    static void R5_demo(int n,int sum){
         if (n<1){
            System.out.print(sum);
            return;
         }
         R5_demo(n-1,sum+n);
    }

    static int R6_demo(int n){
        if(n==0) {
            return 0;
        }
        return n+R6_demo(n-1);
    }

    static int R7_demo(int n){
        if(n==1) return 1;
        return n*R7_demo(n-1);
    }
   
    static void R1_Reversing_The_Array(int[] arr,int start,int end){
        if(start>=end){
            return ;
        }
          swap(arr,start,end);
            R1_Reversing_The_Array(arr,start+1,end-1);
    }
    static void swap(int[] arr,int left,int right){
           int temp=arr[left];
           arr[left]=arr[right];
           arr[right]=temp;
    }

    static void R2_Palindrome_Or_Not(String s){
          R2_Palindrome_Or_Not(s,0,s.length()-1);
    }
    static void R2_Palindrome_Or_Not(String s,int start,int end){
        if(start>=end){
            System.out.print("Palindrome");
            return;
        }
        if(s.charAt(start)!=s.charAt(end)){
            System.out.print("Not a palindrome");
            return;
        }
        R2_Palindrome_Or_Not(s,start+1,end-1);
    }

    static int R3_Fibonaci(int first,int second,int n){
        if(n==first) return first;
        if(n==second) return second;
         
        return R3_Fibonaci(first,second,n-1)+R3_Fibonaci(first,second,n-2);

    }
}
   
