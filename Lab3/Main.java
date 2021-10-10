package Lab3;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class Main {
    public static boolean isBalanced(String expression){
        //create an empty stack of characters
        Deque<Character> stack = new LinkedList();

        boolean balance = true;
        int index = 0;


        while(balance && index < expression.length()){
            char ch =  expression.charAt(index);

            if(isOpen(ch)){
                stack.addFirst(ch);
            }else if(isClosed(ch)){
                    if(stack.isEmpty()){
                        balance = false;
                    }else{

                        char topChar = stack.removeFirst();
                        boolean matching = isMatch(topChar,ch);
                        if(!matching){
                            balance = false;
                        }
                    }
            }
            index++;
        }

        if(balance && stack.isEmpty()){
            return true;
        }else
            return false;

    }
    private static boolean isOpen(char ch){
        if(ch == '{' || ch == '(' || ch == '[' || ch == '<')
                return true;
        return false;
    }
    private static boolean isClosed(char ch){
        if(ch == '}'|| ch == ')'|| ch == ']'|| ch == '>')
            return true;
        return false;
    }
    private static boolean isMatch(char top, char bottom){
        if(top == '{' && bottom == '}' || top == '(' && bottom == ')' ||
                top == '[' && bottom == ']' || top =='<' && bottom == '>')
                    return true;

       return false;
    }
}
