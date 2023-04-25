package Exercise5;

public class App {
    public static void main(String[] args) {
        SortedLinkedList sll = new SortedLinkedList();
        SortedLinkedList sll2 = new SortedLinkedList();
        sll.addElement("a");
        sll.addElement("b");
        sll.addElement("z");
        sll.addElement("g");
        sll.addElement("f");
        sll.udskrivElements();
        System.out.println();
        sll2.addElement("c");
        sll2.addElement("d");
        sll2.addElement("j");
        sll2.udskrivElements();
        sll.addAll(sll2);
        System.out.println();
        sll.udskrivElements();
        System.out.println(sll.countElementsRecursion());
    }
}
