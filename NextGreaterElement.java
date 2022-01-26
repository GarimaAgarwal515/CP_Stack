package stack;

import java.util.Stack;

public class NextGreaterElement {
    public static void NextGreaaterElement(int arr[]) {


        Stack<Integer> st = new Stack<>();
        int NGE[] = new int[arr.length];
        st.push(0);
        for (int i = 1; i < arr.length; i++) {
            while (!st.isEmpty() && arr[st.peek()] < arr[i]) {
                NGE[st.pop()] = arr[i];
            }
            st.push(i);
        }
        while(!st.isEmpty()) {
            NGE[st.pop()] = -1;
        }


        for (int i = 0; i < NGE.length; i++){
            System.out.println("Next Greater Element of" +arr[i]+ " is "+ NGE[i]);
        }
    }
    public static void main(String[] args) {
        int[] arr = {100, 80, 60, 70, 60, 75, 85};
        NextGreaaterElement(arr);

    }
}
