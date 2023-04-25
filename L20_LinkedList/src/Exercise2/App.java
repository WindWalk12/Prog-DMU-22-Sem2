package Exercise2;

public class App {
    public static void main(String[] args) {
        SortedLinkedList sll = new SortedLinkedList();
        sll.addElement("a");
        sll.addElement("b");
        sll.addElement("z");
        sll.udskrivElements();
        System.out.println(sll.countElements());
        sll.addElement("c");
        System.out.println();
        sll.udskrivElements();
        System.out.println(sll.countElements());
        sll.removeElement("c");
        sll.removeElement("z");
        System.out.println();
        sll.udskrivElements();
    }
}
