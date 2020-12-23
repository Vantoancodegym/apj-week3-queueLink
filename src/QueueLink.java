public class QueueLink {
    public static void main(String[] args) {
        QueueLink queueLink=new QueueLink();
        queueLink.enQueue(1);
        queueLink.enQueue(2);
        queueLink.enQueue(3);
        queueLink.enQueue(4);
        queueLink.deQueue();
        queueLink.deQueue();
        queueLink.deQueue();
        queueLink.deQueue();
        queueLink.displayQueue();

    }
    public Node front;
    public Node rear;
    public void enQueue(int data){
        Node holder=new Node(data);
        if (isEmty()){
            front=rear=holder;
            return;
        }
        rear.link=holder;
        rear=holder;
        rear.link= front;
    }
    public Node deQueue(){
        if (isEmty())return null;
        Node holder=front;
        if (front==rear){
            front=null;
            rear=null;}
        else {
            front=front.link;
            rear.link=front;
        }
        return holder;
    }
    public void displayQueue() {
        if (isEmty()) {
            System.out.println("list is emty");
        } else {
            Node temp = front;
            while (temp.link != front) {
                System.out.println(temp.data + " ");
                temp = temp.link;
            }
            System.out.println(rear.data);
        }
    }
    public boolean isEmty(){
        return front==null;
    }

}
class Node{
    public int data;
    public Node link;

    public Node(int data) {
        this.data = data;
    }
}
