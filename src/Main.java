import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        int n= scn.nextInt();
        int A[] = new int[n];
        String B = "";
        for(int i=0;i<n;i++){
            A[i]= scn.nextInt();
        }
        B= scn.next();
        System.out.println(calculate(A,B,n));
    }

    private static int calculate(int[] A, String B, int n) {
        Stack<Integer> stk=new Stack<>();
        for(int i=0;i<n;i++){
            if(stk.isEmpty() || B.charAt(i)=='R'){
                stk.push(i);
            }
            else if(B.charAt(i)=='L'){
                if(B.charAt(stk.peek())=='L'){
                    stk.push(i);
                }
                else if(B.charAt(stk.peek())=='R'){
                    if(A[i]<A[stk.peek()]){
                    }
                    else if(A[i]>A[stk.peek()]){
                        while(!stk.isEmpty() && B.charAt(stk.peek())=='R' && A[i]>A[stk.peek()]){
                            stk.pop();
                        }
                        stk.push(i);
                    }
                    else if(A[i]==A[stk.peek()]){
                        //while(!stk.isEmpty() && A[i]==A[stk.peek()]){
                            stk.pop();
                        //}
                    }
                    else{
                        stk.push(i);
                    }
                }
            }
        }
        return stk.size();
    }


}
