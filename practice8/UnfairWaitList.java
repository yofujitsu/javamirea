package practice8;

import java.util.concurrent.ConcurrentLinkedQueue;

public class UnfairWaitList<E> extends WaitList<E> {

    public UnfairWaitList() { super(); }

    public void remove(E element) { content.remove(element); }

    //перемещение переданного элемента в конец очереди
    void moveToBack(E element) {
        if(content.remove(element)) {
            ConcurrentLinkedQueue<E> temp = new ConcurrentLinkedQueue<E>();
            temp.add(element);
            temp.addAll(content);
            content = temp;
        }
    }

}
