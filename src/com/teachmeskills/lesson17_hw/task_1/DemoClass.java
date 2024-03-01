package com.teachmeskills.lesson17_hw.task_1;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * This class implements logic using a functional interface
 */
public class DemoClass {
    public static void getDemo() {
        try (Scanner scanner1 = new Scanner(System.in);
             Scanner scanner2 = new Scanner(System.in);
             Scanner scanner3 = new Scanner(System.in);
        ) {
            System.out.println("Выбирите 1 или 2;");
            int userChoice = scanner1.nextInt();

            MyFunctionalInterface<String> myFunctionalInterface1 = (s) -> {
                String reverseString = new StringBuilder(s).reverse().toString();
                System.out.println(s + " -> " + reverseString);
                return reverseString;
            };

            MyFunctionalInterface<Integer> myFunctionalInterface2 = (num) -> {
                int sum = 1;
                for (int i = 1; i <= num; i++) {
                    sum *= i;
                }
                System.out.println("Факториал: " + num + " -> " + sum);
                return sum;
            };

            if (userChoice == 1) {
                System.out.println("Введите строку");
                String userString = scanner2.nextLine();

                myFunctionalInterface1.doSomething(userString);
            } else if (userChoice == 2) {
                System.out.println("Введите цифру");
                int userInt = scanner3.nextInt();

                myFunctionalInterface2.doSomething(userInt);
            } else {
                System.out.println("Только 1 или 2");
            }
        } catch (InputMismatchException e) {
            System.out.println("Не верно введённые данные");
        } catch (Exception e) {
            System.out.println("Другая ошибка");
        }
    }
}
