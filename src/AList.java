public class AList<T> {
    private T[] data;
    private int size;
    private int capacity;

    public AList() {
        capacity = 10;
        data = (T[]) new Object[capacity];
        size = 0;
    }

    public void addy(T item) {
        if (size == capacity) {
            capacity *= 2;
            T[] newData = (T[]) new Object[capacity];
            System.arraycopy(data, 0, newData, 0, size);
            data = newData;
        }
        data[size++] = item;
    }

    public void removy(int pos) {
        if (pos < 0 || pos >= size) {
            return; // Or throw an exception
        }
        System.arraycopy(data, pos + 1, data, pos, size - pos - 1);
        size--;
    }

    @Override
    public String toString() {
        if (size == 0) {
            return "Empty List";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
            sb.append(data[i].toString()).append("\n");
        }
        return sb.toString();
    }
}