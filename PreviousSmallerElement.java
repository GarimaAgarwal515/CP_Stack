package stack;

import java.util.Stack;

public class PreviousSmallerElement {

    public static void previousSmallerElement(int arr[]){
        Stack<Integer>st = new Stack<>();

        int PSE[]= new int[arr.length];
        PSE[0]=-1;
        st.push(0);
        for(int i=1; i<arr.length; i++) {
            while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
                st.pop();

            }


            if (!st.isEmpty()) {
                PSE[i] = arr[st.peek()];
            } else {
                PSE[i] = -1;
            }
            st.push(i);
        }

     for (int i = 0; i < PSE.length; i++){
        System.out.println("previous Smaller Element of" +arr[i]+ " is "+ PSE[i]);
    }
}
    public static void main(String[] args) {
        int[] arr = {100, 80, 60, 70, 60, 75, 85};
        previousSmallerElement(arr);

    }
}
