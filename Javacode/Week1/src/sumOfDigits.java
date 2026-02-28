import java.util.Scanner;

public class sumOfDigits {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        System.out.print("Nhập số n: ");
        int n = data.nextInt();
        System.out.print(SumOfDigits(n));
    }
    public static int SumOfDigits(int x) {
        int sum = 0;
        if (x < 0) {x=-x;}
        while (x > 0) {
            sum += x % 10;
            x = x / 10;
        }
        return sum;
    }
}
