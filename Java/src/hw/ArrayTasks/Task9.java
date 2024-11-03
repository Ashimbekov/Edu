package hw.ArrayTasks;

import java.util.Scanner;

//Создайте массив, содержащий рост учеников класса (вводится с клавы).
// Рост мальчиков условно задан отрицательными числами.
// Верно ли, что средний рост мальчиков превышает средний рост девочек более чем на 10 см?
public class Task9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int boysCount = 0, girlsCount = 0;
        double boysSum = 0, girlsSum = 0;

        for (int height : arr) {
            if (height < 0) {
                boysSum += -height;
                boysCount++;
            } else {
                girlsSum += height;
                girlsCount++;
            }
        }

        double boysAverage = boysCount > 0 ? boysSum / boysCount : 0;
        double girlsAverage = girlsCount > 0 ? girlsSum / girlsCount : 0;

        if (boysAverage - girlsAverage > 10) {
            System.out.println("средний рост мальчиков превышает средний рост девочек более чем на 10 см");
            System.out.println("Средний рост мальчиков " + boysAverage);
            System.out.println("Средний рост девочек " + girlsAverage);
        } else {
            System.out.println("средний рост мальчиков не превышает средний рост девочек");
            System.out.println("Средний рост мальчиков " + boysAverage);
            System.out.println("Средний рост девочек " + girlsAverage);
        }
    }
}
