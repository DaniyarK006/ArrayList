import java.util.MyArrayList;
public class Main {

    public static void main(String[] args) {

        MyArrayList<String> arrayList = new MyArrayList<String>();

        arrayList.add(5);
        arrayList.add(10);
        arrayList.addFirst(1);
        arrayList.add(1,3);

        System.out.println("MyArrayList - Size: " + arrayList.size());
        System.out.println("Element at index 2: " + arrayList.get(2));
        arrayList.removeLast();
        System.out.println("After removeLast(), Size: " + arrayList.size());

        MyLinkedList<String> linkedList= new MyLinkedList<>();
        linkedList.add("A");
        linkedList.add("B");
        linkedList.addFirst("C");
        linkedList.add(1,"D");
        System.out.println("MyLinkedList - Size: " + linkedList.size());
        System.out.println("First element: " + linkedList.getFirst());
        linkedList.removeLast();
        System.out.println("After removeLast(), Size: " + linkedList.size());

    }
}