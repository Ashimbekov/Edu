package hw.ArrayTasks;


import java.util.Scanner;

// Создайте массив из 12 чисел считанных с клавиатуры.
// Определите какой элемент является в этом массиве максимальным и сообщите индекс его последнего вхождения в массив
public class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[12];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int max = arr[0];
        int lastIndex = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                lastIndex = i;
            } else if (arr[i] == max) {
                lastIndex = i;
            }
        }

        System.out.println("max " + max);
        System.out.println("last index " + lastIndex);
    }
}
