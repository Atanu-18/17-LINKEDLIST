class test {

    Node head;

    class Node {
        String data;
        Node next;

        //constructor 
        Node (String data){
            this.data = data;
            this.next = null;
        }
    }

    // add - first
    public void addFirst(String data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }


    // add - last 



    //print
    public void printList() {
        if (head == null) {
            System.out.println("It is empty");
            return;
        }

        Node currNode = head;
        while (currNode != null) {
            System.out.println(currNode.data + "->");
            currNode = currNode.next;
        }

        System.out.println("NULL");
    }


    public static void main(String[] args) {
        //object 
        test list = new test();

        list.addFirst("a");
        list.addFirst("is");

        list.printList();
   }
}
