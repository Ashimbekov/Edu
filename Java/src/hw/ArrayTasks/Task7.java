package hw.ArrayTasks;

import java.util.Scanner;

// Создайте два массива из 10 чисел считанных с клавиатуры и третий массив из 10 действительных чисел.
// Каждый элемент с i-ым индексом третьего массива должен равняться отношению элемента из первого массива с i-ым индексом
// к элементу из второго массива с i-ым индексом.
// Вывести все три массива на экран (каждый на отдельной строке), затем вывести количество целых элементов в третьем массиве.
public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr1 = new int[10];
        int[] arr2 = new int[10];
        double[] arr3 = new double[10];

        System.out.println("arr1 input ");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.println("arr2 input ");
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();
        }

        for (int i = 0; i < arr3.length; i++) {
            if (arr2[i] != 0) {
                arr3[i] = (double) arr1[i] / arr2[i];
            } else {
                arr3[i] = 0;
            }
        }

        System.out.print("arr1: ");
        for (int num : arr1) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.print("arr2: ");
        for (int num : arr2) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.print("arr2: ");
        for (double num : arr3) {
            System.out.println(num + " ");
        }
        System.out.println();

        int countIntegers = 0;
        for (double num : arr3) {
            if (num == Math.floor(num)) {
                countIntegers++;
            }
        }

        System.out.println("Количество целых элементов в третьем массиве: " + countIntegers);
    }
}
