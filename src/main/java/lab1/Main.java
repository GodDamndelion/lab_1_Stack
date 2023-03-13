package lab1;

import lab1.stack.*;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> IntStack = new Stack<Integer>();
        System.out.println(IntStack);
        System.out.println(IntStack.top());
        System.out.println(IntStack.pop());
        IntStack.erase();
        System.out.println("Stack is" + (IntStack.empty() ? "" : " not") + " empty");
        System.out.println("Stack filling");
        IntStack.push(1);
        IntStack.push(2);
        IntStack.push(3);
        IntStack.push(4);
        System.out.println("Stack is" + (IntStack.empty() ? "" : " not") + " empty");
        System.out.println("Current top:" + IntStack.top());
        System.out.println("Element " + IntStack.pop() + " was deleted");
        System.out.println("Current top:" + IntStack.top());
        System.out.println("Current stack:" + IntStack);
        System.out.println("Stack erasing");
        IntStack.erase();
        System.out.println("Stack is" + (IntStack.empty() ? "" : " not") + " empty");
    }
}
