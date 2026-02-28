import java.util.Scanner;
public class isPrime {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        System.out.print("Nhập số n: ");
        int n = data.nextInt();
        boolean check = true;
        if (n < 2) {check = false;}
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {check = false;}
        }
        System.out.print(check);
    }
}
