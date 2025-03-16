package exercise;

class SafetyList {
    // BEGIN
    private int[] elements = new int[10];
    private int size = 0;

    public synchronized void add(int value) {
        if (size == elements.length) {
            int[] newArray = new int[elements.length * 2];
            System.arraycopy(elements, 0, newArray, 0, elements.length);
            elements = newArray;
        }
        elements[size] = value;
        size++;
    }

    public int get(int index) {
        return elements[index];
    }

    public int getSize() {
        return size;
    }
    // END
}
