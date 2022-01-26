package stack;

import java.util.Stack;

public class NextSmallerElement {
    public static void NextSmallerElement(int arr[]) {

        Stack<Integer> st = new Stack<>();
        int NSE[] = new int[arr.length];
        st.push(0);
        for (int i = 1; i < arr.length; i++) {
            while (!st.isEmpty() && arr[st.peek()] > arr[i]) {
                NSE[st.pop()] = arr[i];

            }
            st.push(i);
        }
            while (!st.isEmpty()) {
                NSE[st.pop()] = -1;

            }
            for (int i = 0; i < NSE.length; i++) {
                System.out.println("Next Smaller Element of" + arr[i] + " is " + NSE[i]);
            }
        }

        public static void main(String[] args) {
            int[] arr = {100, 80, 60, 70, 60, 75, 85};
            NextSmallerElement(arr);


        }
}





