import java.util.Scanner;

public class PlaindromeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to check Palindrome:");
        int x=sc.nextInt();
         if (x < 0)System.out.println("Not Palindrome");
else{
        int original = x;
        int rev = 0;

        while (x > 0) {
            rev = rev * 10 + x % 10;
            x /= 10;
        }

        if(original == rev)System.out.println("Palindrome");
        else System.out.println("Not palindrome");   
     }
     sc.close();

    }
}
