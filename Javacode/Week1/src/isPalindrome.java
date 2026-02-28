import java.util.Scanner;
public class isPalindrome {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        System.out.print("Nhập số n: ");
        int x = data.nextInt();
        int rev = 0;
        int original = x;
        boolean check = false;
        while (x>0) {
            rev = rev*10 + x%10;
            x = x/10;
        }
        if (original == rev) {check = true;}
        System.out.print(check);
    }
}
