import java.util.Scanner;

public class sumOfDigits {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        System.out.print("Nhập số n: ");
        int x = data.nextInt();
        int sum = 0;
        if (x < 0) {x=-x;}
        while (x > 0) {
            sum += x % 10;
            x = x / 10;
        }
        System.out.print(sum);
    }
}
