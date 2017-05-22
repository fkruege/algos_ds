package ctci.Chapter4;


import BST.MyBST;
import edu.princeton.cs.algs4.Stack;

// Tree has no ordering
public class CommonAncestor4_8_BinaryTree {


    private MyBST<Integer, Integer> bst;
    Stack<Integer> stackA;
    Stack<Integer> stackB;

    public CommonAncestor4_8_BinaryTree(MyBST<Integer, Integer> bst) {
        this.bst = bst;
    }


    public Integer findAncestor(int a, int b) {
        MyBST.Node<Integer, Integer> root = bst.getRoot();

        stackA = new Stack<Integer>();
        stackB = new Stack<Integer>();

        findCommonAncestor(root, a, b);

        if (stackA.isEmpty() || stackB.isEmpty()) {
            return null;
        }

        if (!(stackA.peek() == a) || !(stackB.peek() == b)) {
            return null;
        }

        equalizeStacks();

       if(stackA.size() == 1 && stackB.size() == 1) {
           return null;
       }

        if(stackA.size() >= 2 && stackB.size() >= 2){
            stackA.pop();
            return stackA.pop();
        }

        return null;
//
//        if(stackA.peek() != stackB.peek()){
//            return null;
//        }else

    }

    private void equalizeStacks() {
        int sizeOfA = stackA.size();
        int sizeOfB = stackB.size();

        if (sizeOfA == sizeOfB) {

        } else if (sizeOfA > sizeOfB) {
            shortenStack(stackA, sizeOfB);
        } else {
            shortenStack(stackB, sizeOfA);
        }

    }

    private void shortenStack(Stack<Integer> stack, int desiredSize) {
        while (!stack.isEmpty() && stack.size() != desiredSize) {
            stack.pop();
        }

    }


    // root, pre(left), pre(root)
    private void findCommonAncestor(
            MyBST.Node<Integer, Integer> node,
            int a, int b) {

        if (node == null) {
            return;
        }

        int compareToA = node.value.compareTo(a);
        int compareToB = node.value.compareTo(b);

        if(stackA.isEmpty()){
            stackA.push(node.value);
        }else{
            if(stackA.peek() != a){
                stackA.push(node.value);
            }
        }

        if(stackB.isEmpty()){
            stackB.push(node.value);
        }else{
            if(stackB.peek() != b){
                stackB.push(node.value);
            }
        }

        if ((stackA.size() >= 1 && stackA.peek() == a) &&
                (stackB.size() >= 1 && stackB.peek() == b)
                ) {
            return;
        }

        findCommonAncestor(node.left, a, b);
        findCommonAncestor(node.right, a, b);


    }


}
