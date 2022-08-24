package com.bridgelab;

public class StackMainImplimentation {
    public static void main(String[] args) {

        System.out.println("deleting element ::");

        Stack stack = new Stack();


        stack.addNode(70);
        stack.addNode(30);
        stack.addNode(56);

        stack.peak();
        stack.deleteHead();
        stack.printList();
        stack.peak();
        stack.deleteHead();
        stack.printList();
        stack.peak();
        stack.deleteHead();

    }
}
