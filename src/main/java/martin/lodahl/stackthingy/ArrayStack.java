package martin.lodahl.stackthingy;

public class ArrayStack<T> {

    private T[] data = null;
    private int top = 0;
    
    public ArrayStack(int size){
        data = (T[]) new Object[size];
    }

    public void push(T Element) {
        data[top] = Element;
        top += 1;
    }

    public T pop() {
        top -= 1;
        return data[top];
    }

    public boolean isEmpty() {
        if (top == 0) {
            return true;
        } else {
            return false;
        }
    }
}
