package sjjg;

/**
 * 顺序栈 数组实现
 *
 * @author adx
 * @date 2020/8/5 10:06
 */
public class ArrayStack<T> {
    public int maxSize;
    public int top;
    public T[] quen;

    /**
     * 初始栈
     * @param maxSize
     */
    public ArrayStack(int maxSize){
        this.maxSize = maxSize;
        this.quen = (T[]) new Object[maxSize];
        this.top = -1;
    }

    public boolean pushStack(T a){
        if (isFullStack()){
            return false;
        }
        top ++;
        quen[top] = a;
        return true;
    }

    public T popStack(){
        if (isEmptyStack()){
            return null;
        }
        T t = quen[top];
        top --;
        return t;
    }

    public boolean isEmptyStack(){
        if (top == - 1){
            return true;
        }
        return false;
    }

    public boolean isFullStack(){
        if (top == maxSize - 1){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayStack<Integer> arrayStack = new ArrayStack<Integer>(1);
        System.out.println(arrayStack.pushStack(1));
        System.out.println(arrayStack.pushStack(2));
        System.out.println("--------isEmptyStack值=" + arrayStack.isEmptyStack() + "," + "当前类=ArrayStack.main()");
        System.out.println(arrayStack.popStack());
        System.out.println(arrayStack.popStack());
    }

}
