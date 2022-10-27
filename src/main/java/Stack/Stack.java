package Stack;
public class Stack<Item> {
    private Node head;
    public int count = 0;
    private class Node {
        Item item;
        Node next;
    }
    public void add(Item value){
        count++;
        Node newNode = new Node();
        newNode.item = value;
        newNode.next =this.head;
        this.head = newNode;
    }
    public Item unshift(){
        count--;
        Item item = this.head.item;
        this.head = this.head.next;
        return item;
    }
    public boolean isEmpty (){
        return count == 0;
    }
}
