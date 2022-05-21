package structure;

public class CyclicList implements CollectionList {

    private Node head;
    private Node lastNode;

    @Override
    public boolean add(int value) {
        if (head == null) {
            head = new Node(value);
            head.next = head;
            lastNode = head;
        } else {
            lastNode.next = new Node(value);
            lastNode = lastNode.next;
            lastNode.next = head;
        }
        return true;
    }

    @Override
    public boolean delete(int value) {
        if (head.data == value) {
            if (head.next == head) {
                head = null;
                lastNode = null;
            } else {
                head = head.next;
                lastNode.next = head;
            }
            return true;
        }
        Node node = head;
        while (node.next != head) {
            if (node.next.data == value) {
                if (node.next.next == head) {
                    node.next = node.next.next;
                    lastNode = node;
                } else {
                    node.next = node.next.next;
                }
            } else {
                node = node.next;
            }
        }
        return true;
    }

    @Override
    public int get(int index) {
        Node node = head;
        int result;
        if (node == null) throw new IndexOutOfBoundsException("list not contains element");
        if (index == 0) return node.data;
        while (index > 0) {
            index--;
            node = node.next;
        }
        if (node == null || node == head) throw new IndexOutOfBoundsException("array size limit");
        result = node.data;
        return result;
    }

    @Override
    public void sort() {
        for (Node startNode = head; startNode != lastNode; startNode = startNode.next) {
            for (Node startNodeL = head; startNodeL != lastNode; startNodeL = startNodeL.next) {
                if (startNodeL.data > startNodeL.next.data) {
                    int tmp = startNodeL.next.data;
                    startNodeL.next.data = startNodeL.data;
                    startNodeL.data = tmp;
                }
            }
        }
    }

    @Override
    public void printCollection() {
        Node el = head;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        do {
            if (el == null) break;
            stringBuilder.append(el.data).append(",");
            el = el.next;
        } while (el != head);
        stringBuilder.append("]");
        System.out.println(stringBuilder);
    }
}

/**
 * Узел
 */
class Node {
    public int data;
    public Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}