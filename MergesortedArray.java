public class MergesortedArray {
    public static void main(String[] args) {

        int[] arr1 = {1,2,3,0,0,0};
        int[] arr2 = {2,5,6};

        int n = 3; // valid elements in arr1
        int m = arr2.length;

        // Step 1: copy arr2 into arr1
        for (int i = 0; i < m; i++) {
            arr1[n + i] = arr2[i];
        }

        // Step 2: bubble sort arr1
        int total = n + m;
        for (int i = 0; i < total - 1; i++) {
            for (int j = 0; j < total - 1 - i; j++) {
                if (arr1[j] > arr1[j + 1]) {
                    int temp = arr1[j];
                    arr1[j] = arr1[j + 1];
                    arr1[j + 1] = temp;
                }
            }
        }

        // Print result
        for (int x : arr1) {
            System.out.print(x + " ");
        }
    }
}
