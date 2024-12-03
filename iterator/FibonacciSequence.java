package iterator;

import java.util.Iterator;

public class FibonacciSequence implements ISequence {
    @Override
    public Iterator<Integer> iterator() {
        return new FibonacciIterator();
    }
}
