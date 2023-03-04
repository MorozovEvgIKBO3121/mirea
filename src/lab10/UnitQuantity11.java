package lab10;

import java.util.Scanner;

public class UnitQuantity11 {
    public static void main(String[] args) {
        System.out.println(recursion());
    }
    private static int recursion(){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if (a == 1) {
            int b = scanner.nextInt();
            if (b == 1) {
                return recursion() + a + b;
            }
            else {
                int c = scanner.nextInt();
                if (c == 1){
                    return recursion() + a + c;
                }
                else {
                    return a;
                }
            }
        }
        else {
            int b = scanner.nextInt();
            if (b == 1) {
                return recursion() + b;
            }
            else {
                return b;
            }
        }
    }
}

