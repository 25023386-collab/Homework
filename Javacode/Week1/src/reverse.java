import java.util.Scanner;
public class reverse {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        System.out.print("Nhập số n: ");
        int x = data.nextInt();
        int rev = 0;
        int original = x;
        if (x < 0) {x=-x;}
        while (x>0) {
            rev = rev*10 + x%10;
            x = x/10;
        }
        if (original < 0) {rev = -rev;}
        System.out.print(rev);
    }
}
