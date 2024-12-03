package iterator;

public class FibonacciIterator implements java.util.Iterator<Integer> {
    private int previous = 1;
    private int current = 1;
    private int count = 0;
    private int maxCount;

    public FibonacciIterator() {
        this.maxCount = 10;
    }

    @Override
    public boolean hasNext() {
        return count < maxCount;
    }

    @Override
    public Integer next() {
        if (!hasNext()) {
            throw new java.util.NoSuchElementException();
        }
        if (count < 2) {
            count++;
            return 1;
        }
        int nextValue = previous + current;
        previous = current;
        current = nextValue;
        count++;
        return nextValue;
    }
}
