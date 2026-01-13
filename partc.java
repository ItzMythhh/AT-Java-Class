import java.util.Arrays;
import java.util.Random;

public class partc {
    public static int linearSearch(int[] array, int tgtVal) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == tgtVal)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int n = 10000;
        int[] data = new int[n];

        Random r = new Random();

        for (int i = 0; i < data.length; i++) {
            data[i] = r.nextInt(n) + 1;
        }

        int[] sorted = Arrays.copyOf(data, data.length);
        Arrays.sort(sorted);

        for (int t = 0; t < 10; t++) {
            int target = r.nextInt(n) + 1;

            long start1 = System.nanoTime();
            int linIndex = linearSearch(data, target);
            long end1 = System.nanoTime();
            long linTime = end1 - start1;

            long start2 = System.nanoTime();
            int binIndex = Arrays.binarySearch(sorted, target);
            long end2 = System.nanoTime();
            long binTime = end2 - start2;

            System.out.println("target: " + target);
            System.out.println("linear search index: " + linIndex + " time: " + linTime + " ns");
            System.out.println("binary search index: " + binIndex + " time: " + binTime + " ns");
            System.out.println();
        }
    }
}
