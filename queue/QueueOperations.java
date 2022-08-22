package queue;

public class QueueOperations {

    MyNode head;

    public void enqueue(int data){

        MyNode node = new MyNode(data);
        if (head == null) {
            head = node;
        } else {
            MyNode temp=head;

            while(temp.next!=null) {
                temp=temp.next;
            }
            temp.next=node;
        }

    }

    public void printList() {
        MyNode temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("");
    }
    public void dequeue() {
        System.out.println("Deleting element from queue ::");
        System.out.println("deleting head ");
        MyNode temp=head;
        if(temp!=null) {
            head=temp.next;
        }
    }
}
