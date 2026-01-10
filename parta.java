public class parta {
    public static void main(String[] args) {
        double[] nums = new double[10];
        int currentsize = 5;

        nums[0] = 70;
        nums[1] = 80;
        nums[2] = 90;
        nums[3] = 85;
        nums[4] = 75;

        print(nums, currentsize);

        currentsize = remove(nums, currentsize, 2);

        print(nums, currentsize);
    }

    public static void print(double[] array, int currentsize) {
        for (int i = 0; i < currentsize; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static int remove(double[] array, int currentsize, int targetindex) {
        if (targetindex < 0 || targetindex >= currentsize) {
            return currentsize;
        }

        for (int i = targetindex; i < currentsize - 1; i++) {
            array[i] = array[i + 1];
        }

        currentsize--;
        return currentsize;
    }
}
