package lab10;

import java.util.Scanner;

public class OddIndex13 {
    public static void main(String[] args) {
        recursion3();
    }

    private static void recursion3() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if (a > 0) {
            System.out.println(a);
            int b = scanner.nextInt();
            if (b > 0) {
                int c = scanner.nextInt();
                if (c > 0) {
                    System.out.println(c);
                    int d = scanner.nextInt();
                    if (d > 0) {
                        recursion3();
                    }
                }
            }
        }
    }
}
