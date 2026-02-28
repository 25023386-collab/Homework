import java.util.*;

public class thongngu {
    public static void main(String[] args) {
       Scanner data = new Scanner (System.in);
    //    System.err.print("Nhập số a: ");
    //    int a = data.nextInt();
       System.out.print("Nhập số S: ");
       int S = data.nextInt();
       for (int i = 10000; i < 100000; i++) {
        if (SoNguyenTo(i) && TongChuSo(i) == S)
            System.out.print(i + " ");
       }
    //    System.out.println("\n--- Đã chạy xong ---");

    //    System.err.println(Palindrome(a));
       
    }
    public static boolean SoNguyenTo(int x) {
        if (x < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(x); i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }

       
        
    

    public static int TongChuSo(int x) {
        int tong = 0;
        while (x>0) {
            tong += x%10;
            x = x/10;
        }
        return tong;
    }
       }
        
       
       
   
      

// import java.util.*;

// public class thongngu {
//     public static void main(String[] args) {
//         Scanner data = new Scanner(System.in);
//         System.out.print("Nhập số S: "); // Dùng out cho đồng bộ
//         int S = data.nextInt();
        
//         boolean found = false;
//         for (int i = 10000; i < 100000; i++) {
//             if (SoNguyenTo(i) && TongChuSo(i) == S) {
//                 System.out.print(i + " ");
//                 found = true;
//             }
//         }
        
//         if (!found) {
//             System.out.println("Không tìm thấy số nào thỏa mãn.");
//         }
//         data.close();
//     }

//     public static boolean SoNguyenTo(int x) {
//         if (x < 2) return false;
//         // Dùng <= để chính xác tuyệt đối
//         for (int i = 2; i <= Math.sqrt(x); i++) {
//             if (x % i == 0) return false;
//         }
//         return true;
//     }

//     public static int TongChuSo(int x) {
//         int tong = 0;
//         while (x > 0) {
//             tong += x % 10;
//             x = x / 10;
//         }
//         return tong;
//     }
// }
