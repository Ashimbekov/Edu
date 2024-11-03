package hw.ArrayTasks;


import java.util.Date;
import java.util.Scanner;

//  массиве хранится информация о годе рождения каждого из N человек.
// Определить наибольший порядковый номер самого младшего по возрасту человека
public class Task10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите N: ");
        int N = sc.nextInt();
        int[] birthYears = new int[N];

        System.out.println("Введите годы рождения:");
        for (int i = 0; i < N; i++) {
            birthYears[i] = sc.nextInt();
        }

        int youngestYear = 2024;
        int youngestIndex = -1;

        for (int i = 0; i < N; i++) {
            if (birthYears[i] > youngestYear) {
                youngestYear = birthYears[i];
                youngestIndex = i;
            } else if (birthYears[i] == youngestYear) {
                youngestIndex = Math.max(youngestIndex, i);
            }
        }

        if (youngestIndex != -1) {
            System.out.println("Наибольший порядковый номер самого младшего: " + (youngestIndex + 1));
        } else {
            System.out.println("Не найдено людей в массиве.");
        }
    }
}
