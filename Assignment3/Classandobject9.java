//package Assignment3;

// Interface definition
interface StackOperations {
    void push(int element);
    int pop();
    int peek();
    boolean isFull();
    boolean isEmpty();
}

// Class definition
class Stack implements StackOperations {
    private int maxSize;
    private int[] stackArray;
    private int top;

    // Constructor to create a stack of size 10 using array
    public Stack(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }

    // Push method to insert elements into the stack
    @Override
    public void push(int element) {
        if (!isFull()) {
            stackArray[++top] = element;
            System.out.println("Pushed element: " + element);
        } else {
            System.out.println("Stack is full. Cannot push element: " + element);
        }
    }

    // Pop method to delete elements from the stack
    @Override
    public int pop() {
        if (!isEmpty()) {
            int poppedElement = stackArray[top--];
            System.out.println("Popped element: " + poppedElement);
            return poppedElement;
        } else {
            System.out.println("Stack is empty. Cannot pop element.");
            return -1; // Return a default value in case of an empty stack
        }
    }

    // Peek method to get the top element without removing it
    @Override
    public int peek() {
        if (!isEmpty()) {
            return stackArray[top];
        } else {
            System.out.println("Stack is empty. Cannot peek.");
            return -1; // Return a default value in case of an empty stack
        }
    }

    // Check if the stack is full
    @Override
    public boolean isFull() {
        return top == maxSize - 1;
    }

    // Check if the stack is empty
    @Override
    public boolean isEmpty() {
        return top == -1;
    }
}

// Main class
public class Classandobject9 {
    public static void main(String[] args) {
        // Creating an object of Stack class with size 10
        Stack stack = new Stack(10);

        // Inserting 10 elements into the stack using push method
        for (int i = 1; i <= 10; i++) {
            stack.push(i * 10);
        }

        // Finding factorial of the difference between the largest and smallest elements
        int difference = stack.peek() - stack.pop();
        int factorial = findFactorial(difference);
        System.out.println("Factorial of the difference: " + factorial);

        // Searching for a user-defined element in the stack using peek method
        int searchElement = 50;
        if (stack.peek() == searchElement) {
            System.out.println("Element " + searchElement + " found in the stack.");
        } else {
            System.out.println("Element " + searchElement + " not found in the stack.");
        }
        
        // Deleting 3 elements from the stack using pop method
        for (int i = 0; i < 3; i++) {
            stack.pop();
        }

        // Displaying the remaining elements of the stack
        System.out.println("Remaining elements in the stack:");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }

    // Helper method to find factorial
    private static int findFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * findFactorial(n - 1);
        }
    }
}

