package hw.ArrayTasks;

import java.util.Scanner;


// Создайте массив из 8 чисел считанных с клавиатуры. Выведите массив на экран в строку.
// Замените каждый элемент с нечётным индексом на ноль. Снова выведете массив на экран на отдельной строке.
public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[8];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        for (int i = 1; i < arr.length; i += 2) {
            arr[i] = 0;
        }
        System.out.println();

        for (int num : arr) {
            System.out.print(num + " ");
        }

    }
}
