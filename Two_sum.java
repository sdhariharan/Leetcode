public class Two_sum {
    public static void main(String[] args) {

        int[] arr = {2, 11, 7, 15};
        int target = 9;
        int[] res = new int[2];

        boolean found = false;

        for (int i = 0; i < arr.length && !found; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    res[0] = arr[i];
                    res[1] = arr[j];
                    found = true;
                    break;
                }
            }
        }

        System.out.println(res[0] + " + " + res[1] + " = " + target);
    }
}
