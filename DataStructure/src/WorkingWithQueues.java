import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;

public class WorkingWithQueues {
    public static void main(String[] args) {
        LinkedList<Person> linkedList = new LinkedList<>();

        linkedList.add(new Person("ABC", 21));
        linkedList.add(new Person("XYZ", 19));
        linkedList.addFirst(new Person("FED", 67));

        ListIterator listIterator = linkedList.listIterator();
        //Next
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }
        //Previous
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }
    }

    private static void queues() {
        Queue<Person> queue = new LinkedList<>();

        queue.add(new Person("ABC", 21));
        queue.add(new Person("XYZ", 19));
        queue.add(new Person("DES", 32));

        System.out.println(queue.size());
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue.size());
    }

    record Person(String name, int age) {}

}