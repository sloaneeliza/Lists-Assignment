public class DLList<T> {
    private DLNode<T> head;

    public DLList() {
        head = null;
    }

    public void addy(T item) {
        DLNode<T> newNode = new DLNode<>(item);

        if (head == null) {
            head = newNode;
            return;
        }

        DLNode<T> current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
        newNode.prev = current;
    }

    public void removy(int pos) {
        if (head == null) {
            return;
        }

        if (pos == 0) {
            head = head.next;
            if (head != null) {
                head.prev = null;
            }
            return;
        }

        DLNode<T> current = head;
        int count = 0;

        while (current != null && count < pos) {
            current = current.next;
            count++;
        }

        if (current == null) {
            return;
        }

        if (current.next != null) {
            current.next.prev = current.prev;
        }
        if (current.prev != null) {
            current.prev.next = current.next;
        }
    }

    @Override
    public String toString() {
        if (head == null) return "Empty List";
        StringBuilder sb = new StringBuilder();
        DLNode<T> current = head;
        while (current != null) {
            sb.append(current.data.toString()).append("\n");
            current = current.next;
        }
        return sb.toString();
    }
}