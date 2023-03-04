package lab1;

import org.jetbrains.annotations.NotNull;

public class Number2 {
    public static void main(String @NotNull [] args) {
        System.out.println("Hello World!");
        System.out.println("Всего аргументов в командной строке: " + args.length);
                for (int i = 0; i < args.length; i++) {
                    System.out.println("Hello " + args[i] + "!");
                }
            }
        }


