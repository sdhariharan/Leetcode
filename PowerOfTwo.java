import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {
        Scanner sc=new  Scanner(System.in);
        int n=sc.nextInt();
        if((n&(n-1))==0)
        {
            System.out.println("Power of Two");
        }
        else{
            System.out.println("Not power of Two");
        }
        sc.close();
    }
    
}
