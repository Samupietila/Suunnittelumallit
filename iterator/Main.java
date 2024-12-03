package iterator;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ISequence sequence = new FibonacciSequence();
        Iterator<Integer> iterator = sequence.iterator();

        System.out.println("Fibonacci sequence:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
