package lab1.stack;

/**
 * Стек на базе связанного списка
 * @param <TInfo> Тип хранимых элементов
 */
public class Stack<TInfo> {
    /** Поле, хранящее текущую вершину стека */
    private Node<TInfo> head;

    /** Пустой конструктор */
    public Stack() {}

    /** Возвращает true, если список пуст, либо false в противном случае */
    public boolean empty() { return head == null; }

    /**
     * Добавление нового элемента в стек
     * @param elem Добавляемый элемент
     */
    public void push(TInfo elem)
    {
        head = new Node<>(elem, head);
    }

    /**
     * Удаляет текущую вершину стека и возвращает её, если стек не пуст, иначе просто возвращает null
     * @return Текущая вершина стека
     */
    public TInfo pop()
    {
        if (!empty())
        {
            Node<TInfo> ptr = head;
            head = head.next;
            return ptr.info;
        }
        else
        {
            return null;
        }
    }

    /**
     * @return Текущая вершина стека или null, если стек пуст
     */
    public TInfo top()
    {
        return (head != null ? head.info : null);
    }

    /** Удаляет все элементы в стеке */
    public void erase()
    {
        while (!empty())
        {
            pop();
        }
    }

    /**
     * Возвращает все элементы в стеке в виде строки, начиная с вершины
     * @return Строковое представление всех элементов
     */
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        Node<TInfo> ptr = head;
        while (ptr != null)
        {
            result.append(ptr.info).append("\n");
            ptr = ptr.next;
        }
        return result.toString();
    }
}
