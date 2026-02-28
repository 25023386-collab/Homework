import java.util.Scanner;
public class gcd {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        System.out.print("Nhập số a: ");
        int a = data.nextInt();
        System.out.print("Nhập số b: ");
        int b = data.nextInt();
        System.out.print(Gcd(a,b));
    }
    public static int Gcd(int a, int b) {
        int max = 0;
        int temp = 0;
        if (a>b) {
            temp = a; a = b; b = temp;
        }
        for (int i = 1;i <= a; i++) {
            if (a%i == 0 && b%i == 0)
                max = i;
        }
        return max;
    }
}
