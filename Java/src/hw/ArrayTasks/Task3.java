package hw.ArrayTasks;


import java.util.Scanner;

// Создайте 2 массива из 5 чисел считанных с клавиатуры каждый, выведите массивы на экран в двух отдельных строках.
// Посчитайте среднее арифметическое элементов каждого массива и сообщите,
// для какого из массивов это значение оказалось больше (либо сообщите, что их средние арифметические равны).
public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr1 = new int[5];
        int[] arr2 = new int[5];
        double avgArr1 = 0;
        double avgArr2 = 0;

        System.out.println("arr1 input");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = scanner.nextInt();
        }

        System.out.println("arr2 input");
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = scanner.nextInt();
        }

        System.out.print("arr1 ");
        for (int num : arr1) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.print("arr2 ");
        for (int num : arr2) {
            System.out.print(num + " ");
        }
        System.out.println();


        for (int num : arr1) {
            avgArr1 += num;
        }
        avgArr1 /= arr1.length;

        for (int num : arr2) {
            avgArr2 += num;
        }
        avgArr2 /= arr2.length;

        if (avgArr1 > avgArr2) {
            System.out.println("AVG первого массива больше");
        } else if (avgArr1 < avgArr2) {
            System.out.println("AVG второго массива большое");
        } else {
            System.out.println("AVG массивов равны");
        }
    }
}
