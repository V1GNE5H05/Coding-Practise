class Solution {
    public boolean isValid(String s) {
        char[] stack = new char[s.length()];
        int top = -1;
        char temp;
        if(s.charAt(0) == ')' || s.charAt(0) == '}' || s.charAt(0) == ']') return false;
        int i;
        for(i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                stack[++top] = s.charAt(i);
            }
            else if(top != -1) 
                if(stack[top] == '(' && s.charAt(i) == ')' || stack[top] == '{' && s.charAt(i) == '}' || stack[top] == '[' && s.charAt(i) == ']') top--;
                else return false;
            else if(top == -1 && s.charAt(i) == ')' || top == -1 && s.charAt(i) == '}' || top == -1 && s.charAt(i) == ']') {
                return false;
            }
        }
        return top == -1;
    }
}
