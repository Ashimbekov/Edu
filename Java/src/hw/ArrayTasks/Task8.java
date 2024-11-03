package hw.ArrayTasks;

import java.util.Scanner;

// Пользователь заполняет список из десяти чисел.
// После этого программа должна определить и сообщить пользователю о том,
// сумма элементов какой половины массива больше: левой или правой, либо сообщить, что эти суммы равны
public class Task8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int leftSum = 0;
        int rightSum = 0;

        for (int i = 0; i < 5; i++) {
            leftSum += arr[i];
        }

        for (int i = 5; i < 10; i++) {
            rightSum += arr[i];
        }

        if (leftSum > rightSum) {
            System.out.println("Сумма левой половины больше: " + leftSum + " > " + rightSum);
        } else if (leftSum < rightSum) {
            System.out.println("Сумма правой половины больше: " + rightSum + " > " + leftSum);
        } else {
            System.out.println("Суммы обеих половин равны: " + leftSum);
        }
    }
}
