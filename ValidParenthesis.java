package stack;

import java.util.Stack;

public class ValidParenthesis {

    public static Boolean isValid(String n){
        Stack<Character>st = new Stack<>();
        for(int i=0; i<n.length(); i++){
            char curr=n.charAt(i);
            if (curr == '(' || curr == '[' || curr == '{') {
                st.push(curr);
            }
            else if(curr==')'|| curr==']'|| curr=='}'){
                if(st.isEmpty())return false;
                char top= st.pop();
                if(curr==')'&& top=='('){
                    continue;
                }
                if(curr==']'&& top=='['){
                    continue;
                }
                if(curr=='}'&& top=='{'){
                    continue;
                }
                return false;
            }
        }
        if(!st.isEmpty())return false;
        return true;

    }
    public static void main(String[] args) {
        String n = "((){}[])[]";
        System.out.println(isValid(n));

    }
}
