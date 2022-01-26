package stack;

import java.util.Stack;

public class StockSpan {
    public static void stockSpan(int arr[]) {
        Stack<Integer> st = new Stack<>();
        int span[] = new int[arr.length];
        span[0] = 1;
        st.push(0);
        for (int i = 1; i < arr.length; i++) {
            while (!st.isEmpty() && arr[st.peek()] <= arr[i]) {
                st.pop();

            }
            if (!st.isEmpty()) {
                span[i] = i - st.peek();

            }else{
            span[i] = i+1;
        }
            st.push(i);

        }
        for (int i = 0; i < span.length; i++) {
            System.out.println("span of" + arr[i] + " is " + span[i]);
        }
    }
    public static void main(String[] args) {
        int[] arr = {100, 80, 60, 70, 60, 75, 85};
        stockSpan(arr);

    }
}
