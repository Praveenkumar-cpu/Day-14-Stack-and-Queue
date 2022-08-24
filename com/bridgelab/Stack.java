package com.bridgelab;

public class Stack {
    MyNode head;
    
    public void addNode(int data) {

        MyNode node = new MyNode(data);

        if (head == null) {
            head = node;
        } else {
          node.next = head;
            head = node;
        }
        printList();
    }

    public void printList() {
        MyNode temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("");
    }


    public void peak() {
        MyNode peakValue = head;
        System.out.println("Top element is :");
        System.out.println(head.data);
    }


    public void deleteHead() {
        System.out.println("deleting top node");
        MyNode temp = head;
        if (temp != null) {
            head = temp.next;
        }

    }
}
