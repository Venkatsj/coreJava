package ds;

public class LinkeList {

    static int counter = 0;
    Node head = null;
    public void insert(String data){
        Node node = new Node(data);
        if(head == null){
            head = node;
        }else{
            Node tempNode = head;
            while(tempNode.next != null){
                tempNode = tempNode.next;
            }
            tempNode.next = node;
        }
    }

    public void show(){
        Node temp = head;
        if(temp != null){
            do{
                System.out.println(temp.data);
                temp = temp.next;
            }while(temp != null);
        }

    }

    public void findFromLast(int index){
        Node last = null;
        Node tempNode = head;
        int length = 1;
        if(head != null) {
            while (tempNode.next != null) {
                tempNode = tempNode.next;
                length++;
            }
        }

        tempNode = head;
        while(length-index-1 > 0){
            tempNode = tempNode.next;
            length--;
        }

        System.out.println(" Node from last : "+tempNode.data);
    }

    void findFromLastRecursive(Node head, int index){


        if(head == null)
            return;
        findFromLastRecursive(head.next, index);

         if(++counter == index)
             System.out.println(head.data);
    }

    public void reverse(){
        Node temp = head;
        while(temp.next != null)
            temp = temp.next;
        System.out.println();
    }

    Node next ;
    public void delFromLastRecursive(Node head, int index){

        if(head.next == null)
            return;

        delFromLastRecursive(head.next, index);
        counter = counter +1;
        if(counter == index){
            next = head.next.next;
        }
        if(counter == index+1)
            head.next.next = next;
    }

    public void delFromLast(Node head, int index){
        Node dummy = head;
        Node first = head, second = head;
        for(int i=0; i <= index; i++)
            first = first.next;

        while(first != null){
            second = second.next;
            first = first.next;
        }
        second.next = second.next.next;
    }

    public static void main(String[] args){
        LinkeList linkeList = new LinkeList();
        linkeList.insert("1");
        linkeList.insert("2");
        linkeList.insert("3");
        linkeList.insert("4");
        linkeList.insert("5");
        linkeList.insert("6");
        //linkeList.findFromLast( 2);
        //linkeList.findFromLastRecursive(linkeList.head, 3);
        linkeList.delFromLast(linkeList.head, 2);
        linkeList.show();

    }
}
