import java.util.*;
public class fibonacci {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        System.out.print("Nhập số n: ");
        long n = data.nextLong();
        System.out.print(Fibonacci(n));
    }
    public static long Fibonacci(long n) {
        if (n<0) {return -1;}
        if (n == 0) { return 0 ;}
        if (n == 1) {return 1;}
        else {return Fibonacci(n-1) + Fibonacci(n-2);}
    }



}
