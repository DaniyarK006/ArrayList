public class MyLinkedList<T> implements MyList<T>  {
    private class MyNode {
        T element;
        MyNode next;
        MyNode prev;

        MyNode(T element) {
            this.element = element;
        }
    }

     private MyNode head;
        private MyNode tail;
         private int size;

            public MyLinkedList();
            head = null;
            tail = null;
            size = 0;

}
            @Override
            public void add(T item){
                addLast(item);
            }
            @Override
            public void addFirst(T item){

            }