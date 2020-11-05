public class QuickSort {


    public static void main(String[] args) {
        int [] array = new int[] {64, 42, 73, 41, 32, 53, 16, 24, 57, 42, 74, 55, 36};
        arrayToString(array);
        quickSort(array, 0, array.length - 1);
        System.out.println();
        arrayToString(array);

    }

    public static void quickSort(int[] arr, int from, int to) {
        if (from < to) {
            int divideIndex = partition(arr, from, to);
            quickSort(arr, from, divideIndex - 1);
            quickSort(arr, divideIndex, to);
        }
    }

    private static int partition(int[] arr, int from, int to) {
        int first = from;
        int last = to;
        int pivot = arr[from + (to - from) / 2];

        while (first <= last) {
            while (arr[first] < pivot) {
                first++;
            }

            while (arr[last] > pivot) {
                last--;
            }

            if (first <= last) {
                int temp = arr[last];
                arr[last] = arr[first];
                arr[first] = temp;
                first++;
                last--;
            }
        }
        return first;
    }


    private static void arrayToString(int[] array) {
        for (int x : array) {
            System.out.print(x+" ");
        }

    }
}
