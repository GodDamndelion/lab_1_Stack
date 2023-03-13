package lab1.stack;

public class Stack<TInfo> {
    private Node<TInfo> head;
    public Stack() {}
    public boolean empty() { return head == null; }
    public void push(TInfo elem)
    {
        head = new Node<TInfo>(elem, head);
    }
    public TInfo pop()
    {
        Node<TInfo> ptr = head;
        head = head.next;
        return ptr.info;
    }
    public TInfo top()
    {
        return head.info;
    }

    @Override
    public String toString() {
        String result = "";
        Node<TInfo> ptr = head;
        while (ptr != null)
        {
            result += ptr.info + " ";
            ptr = ptr.next;
        }
        return result;
    }
}
