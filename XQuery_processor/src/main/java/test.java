import java.util.*;

public class test {

    public static void main(String[] args) {

        // create a LinkedList
        LinkedList list1 = new LinkedList();

        // add some elements
        list1.add("Hello");
        list1.add(2);
        list1.add("Chocolate");
        list1.add("10");

        // print the list
        System.out.println("LinkedList:" + list1);

        // create a second LinkedList
        LinkedList list2 = new LinkedList();

        // clone list1
        list2 = (LinkedList) list1.clone();
        list1.add("3");
        // print list2
        System.out.println("LinkedList 2:" + list2);
        System.out.println("LinkedList:" + list1);
    }
}