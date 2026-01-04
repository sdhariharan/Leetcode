public class Sqrt {
    public static void main(String[] args) {
        int n=64;
        int s=1;
        for(int i=2;i*i<=n;i++)
        {
            s=i;
        }
        System.out.println(s);
    }
}
