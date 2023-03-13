package lab1.stack.node;

public class Node<TInfo> {
    TInfo info;
    Node<TInfo> next;
    Node(TInfo elem, Node<TInfo> next)
    {
        info = elem;
        this.next = next;
    }
    Node(TInfo elem)
    {
        //this.next = null;
        info = elem;
    }
}
