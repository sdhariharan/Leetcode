public class SingleNumber {
    public static void main(String[] args) {
        int[] arr={1,2,4,4,2};
        int x=0;
        for(int i : arr)
        {
            x^=i;
        }
        System.out.println("Single Number:"+x);
    }
}
