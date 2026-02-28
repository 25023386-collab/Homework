import java.util.Scanner;
public class isPalindrome {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        System.out.print("Nhập số n: ");
        int n = data.nextInt();
        System.out.print(IsPalindrome(n));
    }
    public static boolean IsPalindrome(int x) {
        int rev = 0;
        int original = x;
        while (x>0) {
            rev = rev*10 + x%10;
            x = x/10;
        }
        if (original == rev) {return true;}
        else {return false;}
    }

}
