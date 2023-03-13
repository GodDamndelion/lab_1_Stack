package lab1.stack;

/**
 * Узел стека
 * @param <TInfo> Тип хранимых элементов
 */
class Node<TInfo> {
    /** Хранимая информация */
    TInfo info;

    /** Ссылка на следующий узел */
    Node<TInfo> next;

    /**
     * Конструктор с двумя параметрами
     * @param elem Хранимая в узле информация
     * @param next Ссылка на следующий узел
     */
    Node(TInfo elem, Node<TInfo> next)
    {
        info = elem;
        this.next = next;
    }
}
