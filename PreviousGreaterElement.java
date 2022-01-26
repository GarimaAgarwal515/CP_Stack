package stack;

import java.util.Stack;

public class PreviousGreaterElement {
    public static void previousGreaterElement(int[]arr){
        Stack<Integer>st = new Stack<>();
        int PGE[]= new int[arr.length];
        PGE[0]=-1;
        st.push(0);
        for(int i=1; i<arr.length; i++){
            while(!st.isEmpty()&& arr[st.peek()]<arr[i])
            {
                st.pop();
            }
            if(!st.isEmpty()){
                PGE[i]=arr[st.peek()];
            }
            else {
                PGE[i]=-1;
            }
            st.push(i);
        }
        for (int i = 0; i < PGE.length; i++){
            System.out.println("previous Greater Element of" +arr[i]+ " is "+ PGE[i]);
        }

    }
    public static void main(String[] args) {
        int[] arr = {100, 80, 60, 70, 60, 75, 85};
       previousGreaterElement(arr);


    }
}
