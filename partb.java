public class partb {
    public static void main(String[] args) {
        double[] nums = new double[10];
        int currentsize = 4;

        nums[0] = 60;
        nums[1] = 70;
        nums[2] = 80;
        nums[3] = 90;

        print(nums, currentsize);

        currentsize = insert(nums, currentsize, 1, 100);

        print(nums, currentsize);
    }

    public static void print(double[] array, int currentsize) {
        for (int i = 0; i < currentsize; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static int insert(double[] array, int currentsize, int targetindex, double newelement) {
        if (targetindex < 0 || targetindex > currentsize || currentsize >= array.length) {
            return currentsize;
        }

        for (int i = currentsize; i > targetindex; i--) {
            array[i] = array[i - 1];
        }

        array[targetindex] = newelement;
        currentsize++;
        return currentsize;
    }
}
