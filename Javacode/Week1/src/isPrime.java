import java.util.Scanner;
public class isPrime {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        System.out.print("Nhập số n: ");
        int n = data.nextInt();
        System.out.print(IsPrime(n));
    }

    public static boolean IsPrime(int x) {
        if (x < 2) {return false;}
        for (int i = 2; i <= Math.sqrt(x); i++) {
            if (x % i == 0) {return false;}
        }
        return true;
    }
}

