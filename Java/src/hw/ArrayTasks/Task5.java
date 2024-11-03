package hw.ArrayTasks;


// Создайте массив из 20-ти первых чисел Фибоначчи и выведите его на экран.
// Напоминаем, что первый и второй члены последовательности равны единицам, а каждый следующий — сумме двух предыдущих:
//1 1 2 3 5 8 13 21 34 55 ...
public class Task5 {
    public static void main(String[] args) {
        int[] fibonacci = new int[20];

        fibonacci[0] = 1;
        fibonacci[1] = 1;

        for (int i = 2; i < fibonacci.length; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }

        for (int num : fibonacci) {
            System.out.print(num + " ");
        }
    }
}
