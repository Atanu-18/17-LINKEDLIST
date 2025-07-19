class LL {
    Node head;

    class Node {
        String data;
        Node next;

        // constructor
        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    // add - first, last
    // first

    public void addFirst(String data) {
        Node newNode = new Node(data); // নতুন নোড বানালাম
        if (head == null) {
            head = newNode; // যদি লিস্ট ফাঁকা থাকে
            return;
        }
        newNode.next = head; // নতুন নোডের পরেরটা হবে head
        head = newNode; // head কে সরিয়ে নিয়ে আসলাম নতুন নোডে
    }

    // last
    public void addLast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next; // একদম শেষে যাই
        }

        currNode.next = newNode; // শেষে গিয়ে নতুনটা বসাই
    }

    // print
    public void printList() {
        if (head == null) {
            System.out.println("list is empty");
            return;
        }

        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + "->");
            currNode = currNode.next; // পরের নোডে যাই
        }

        System.out.println("NULL"); // শেষে পৌঁছালে
    }

    public static void main(String[] args) {
        // object
        LL list = new LL();
        list.addFirst("a");
        list.addFirst("is");

        list.printList();

        list.addLast("List");
        list.printList();

        list.addFirst("this");
        list.printList();
    }
}