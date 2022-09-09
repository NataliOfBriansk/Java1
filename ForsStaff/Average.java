package ForsStaff;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите меньшее число: ");
        int min = scanner.nextInt();

        System.out.print("Введите большее число: ");
        int max = scanner.nextInt();

        int i = 0;
        int j = 0;
        int sum = 0;
        int sumEven = 0;
        double average = 0;
        double averageEven = 0;

        do {
            sum = sum + min;
            ++i;                              //количество чисел всего от min до max
            if (min % 2 == 0) {
                ++j;                          //количество только четных чисел
                sumEven = sumEven + min;
            }
            ++min;                            //переходит к следующему числу
        } while (!(min > max));

        average = average + sum * 1.0 / i;

        averageEven = sumEven * 1.0 / j;

        System.out.println("Среднее арифметическое чисел в интервале от " + min + " до " + max + " составляет " + average);
        System.out.println("Среднее арифметическое четных чисел в интервале от " + min + " до " + max + " составляет " + averageEven);
    }
}