public static void swap(int i, int j, int[] arr) {
    if (i >= 0 && i < arr.length && j >= 0 && j < arr.length) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
