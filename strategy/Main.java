package strategy;

public class Main {
    public static void main(String[] args) {
        // array of 30 elements
        int n = 30;
        int[] values = new int[n];
        for (int i = 0; i < n; i++) {
            values[i] = (int) (Math.random() * 100);
        }
        int n2 = 100000;
        int[] values2 = new int[n2];
        for (int i = 0; i < n2; i++) {
            values2[i] = (int) (Math.random() * 100);
        }
        APCContext pancake = new APCContext(new PancakeSort());
        APCContext selection = new APCContext(new SelectionSort());
        APCContext quick = new APCContext(new QuickSort());
        System.out.println("Array of 30 elements:");
        System.out.println(pancake.checkAPC(values));
        System.out.println(selection.checkAPC(values));
        System.out.println(quick.checkAPC(values));
        System.out.println("Array of 100000 elements:");
        System.out.println(pancake.checkAPC(values2));
        System.out.println(selection.checkAPC(values2));
        System.out.println(quick.checkAPC(values2));
    }
}
