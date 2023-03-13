package lab1.stack;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Тестирование стека
 */
class StackTest {

    /** Стек пуст */
    @org.junit.jupiter.api.Test
    void emptyStackIsEmpty() {
        Stack<Integer> IntStack = new Stack<>();
        assertTrue(IntStack.empty());
    }

    /** Стек не пуст */
    @org.junit.jupiter.api.Test
    void emptyStackIsNotEmpty() {
        Stack<Integer> IntStack = new Stack<>();
        IntStack.push(1);
        assertFalse(IntStack.empty());
    }

    /** Из стека удалили последний элемент */
    @org.junit.jupiter.api.Test
    void emptyStackPopped() {
        Stack<Integer> IntStack = new Stack<>();
        IntStack.push(1);
        IntStack.pop();
        assertTrue(IntStack.empty());
    }

    /** Стек очистили */
    @org.junit.jupiter.api.Test
    void emptyStackErased() {
        Stack<Integer> IntStack = new Stack<>();
        IntStack.push(1);
        IntStack.erase();
        assertTrue(IntStack.empty());
    }

    /** Проверка пустого стека */
    @org.junit.jupiter.api.Test
    void testToStringStackIsEmpty() {
        Stack<Integer> IntStack = new Stack<>();
        assertEquals(IntStack.toString(), "");
    }

    /** Проверка не пустого стека */
    @org.junit.jupiter.api.Test
    void testToString() {
        Stack<Integer> IntStack = new Stack<>();
        IntStack.push(1);
        IntStack.push(2);
        IntStack.push(3);
        assertEquals(IntStack.toString(), "3\n2\n1\n");
    }

    /** Добавление одного элемента в стек */
    @org.junit.jupiter.api.Test
    void push1() {
        Stack<Integer> IntStack = new Stack<>();
        IntStack.push(1);
        assertEquals(IntStack.toString(), "1\n");
    }

    /** Добавление двух элементов в стек */
    @org.junit.jupiter.api.Test
    void push2() {
        Stack<Integer> IntStack = new Stack<>();
        IntStack.push(1);
        IntStack.push(2);
        assertEquals(IntStack.toString(), "2\n1\n");
        assertEquals(IntStack.top(), 2);
    }

    /** Проверка удаления вершины стека */
    @org.junit.jupiter.api.Test
    void pop() {
        Stack<Integer> IntStack = new Stack<>();
        assertNull(IntStack.pop());
        IntStack.push(1);
        IntStack.push(2);
        IntStack.pop();
        assertEquals(IntStack.toString(), "1\n");
        assertEquals(IntStack.top(), 1);
        assertEquals(IntStack.pop(), 1);
        assertTrue(IntStack.empty());
    }

    /** Проверка извлечения вершины стека */
    @org.junit.jupiter.api.Test
    void top() {
        Stack<Integer> IntStack = new Stack<>();
        assertNull(IntStack.top());
        IntStack.push(1);
        assertNotNull(IntStack.top());
        assertEquals(IntStack.top(), 1);
        IntStack.push(2);
        assertEquals(IntStack.top(), 2);
        IntStack.erase();
        assertNull(IntStack.top());
    }

    /** Проверка очистки стека */
    @org.junit.jupiter.api.Test
    void erase() {
        Stack<Integer> IntStack = new Stack<>();
        assertTrue(IntStack.empty());
        IntStack.push(1);
        IntStack.push(2);
        assertFalse(IntStack.empty());
        IntStack.erase();
        assertTrue(IntStack.empty());
    }
}