package ctci.Chapter2;

import java.util.Stack;

/**
 * Created by fkruege on 4/1/17.
 */
public class Palindrome2_6_Stack {

    public boolean isPalindrome(Node node) {

        Stack<Integer> stack = new Stack<Integer>();

        Node mid = node;
        Node end = node;
        int count = 0;
        while (end != null && end.next != null) {
            count++;
            stack.push(mid.value);
            mid = mid.next;
            end = end.next.next;
        }

        boolean evenLength = count % 2 == 0;
        if(!evenLength){
            mid =mid.next;
        }

        while(mid != null && !stack.empty()){
            if(mid.value == stack.pop()){
                mid = mid.next;
            }else{
                return false;
            }
        }

        return stack.empty();

    }


}
