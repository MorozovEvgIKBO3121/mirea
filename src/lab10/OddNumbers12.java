package lab10;

import java.util.Scanner;

public class OddNumbers12 {
    public static void main(String[] args) {
        recursion2();
    }
    private static void recursion2(){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if (a>0){
        if (a%2==1){
            System.out.println(a);
            recursion2();
        }
        else {
            recursion2();
        }
        }
    }
}
