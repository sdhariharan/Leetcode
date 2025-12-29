import java.util.Scanner;

public class PowerOfThree {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    while(n%3==0)
        {
            
            n/=3;
        }        
    
    if(n==1)
    {
        System.out.println("Power Of Three");
    }
    else
    {
        System.out.println("Not Power Of Three");
    }
    sc.close();
}
}
