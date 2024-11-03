package hw.ArrayTasks;

import java.util.Scanner;

// Создайте массив из 4 чисел считанных с клавиатуры выведите его на экран в строку.
// Определить и вывести на экран сообщение о том, является ли массив строго возрастающей последовательностью
public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[4];

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.print("Массив: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

        boolean isSequence = true;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] >= array[i + 1]) {
                isSequence = false;
                break;
            }
        }

        if (isSequence) {
            System.out.println("Является строго возрастающей последовательностью.");
        } else {
            System.out.println("Не является строго возрастающей последовательностью.");
        }
    }
}
