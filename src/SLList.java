public class SLList<T> {
    private SLNode<T> head;

    public SLList() {
        head = null;
    }

    public void addy(T item) {
        SLNode<T> newNode = new SLNode<>(item);
        if (head == null) {
            head = newNode;
            return;
        }

        SLNode<T> current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    public void removy(int pos) {
        if (head == null) {
            return;
        }

        if (pos == 0) {
            head = head.next;
            return;
        }

        SLNode<T> current = head;
        SLNode<T> previous = null;
        int count = 0;

        while (current != null && count < pos) {
            previous = current;
            current = current.next;
            count++;
        }

        if (current == null) {
            return;
        }

        previous.next = current.next;
    }

    @Override
    public String toString() {
        if (head == null) return "Empty List";
        StringBuilder sb = new StringBuilder();
        SLNode<T> current = head;
        while (current != null) {
            sb.append(current.data.toString()).append("\n");
            current = current.next;
        }
        return sb.toString();
    }
}