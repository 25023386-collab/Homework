public class secondLargest {
    public static void main(String[] args) {
        int[][] testInputs = {
                {12, 35, 1, 10, 34, 1}, // Mảng bình thường -> 34
                {10, 10, 10},           // Các phần tử trùng nhau -> -1
                {10},                   // Mảng có 1 phần tử -> -1
                {10, 5},                // Mảng có 2 phần tử -> 5
                {5, 10},                // Mảng có 2 phần tử đảo ngược -> 5
                {-1, -2, -5, -1}        // Mảng số âm -> -2
        };
        for (int i = 0; i < testInputs.length; i++) {
            System.out.println(SecondLargest(testInputs[i]));
        }
    }

    public static int SecondLargest(int[] arr) {
        int max1 = 0;
        int max2 = 0;
        if (arr.length <= 1) {return -1;}
        else {
            for (int x : arr) {
                if (x > max1) {
                    max2 = max1;
                    max1 = x;}
                else if (x > max2) {max2 = x;}
            }
            if (max2 != max1) {return max2;}
            else {return -1;}
        }
    }
}
