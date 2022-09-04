package ForsStaff;

import java.util.Scanner;

public class ArithmeticMean {
    public static void main(String[] args) {
        Scanner kl = new Scanner(System.in);
        System.out.print("Введите меньшее число: ");
        int min = kl.nextInt();

        Scanner lk = new Scanner(System.in);
        System.out.print("Введите большее число: ");
        int max = kl.nextInt();

        int i = min;
        int j = 0;
        int sum = 0;
        double srAr = 0;


        do {
            sum = sum + i;
            ++i;
            ++j;
        } while (!(i > max));

        srAr = srAr + sum * 1.0 / j;

        // среднее арифметическое только четных чисел:

        int k = min;
        int m = 0;
        int sSum = 0;

        do {
            if (k % 2 != 0) {
                ++k;
            }
            sSum = sSum + k;
            ++m;
            k = k + 2;
        } while (!(k > max));

        int srArChCh = sSum / m;

        System.out.println("Среднее арифметическое чисел в интервале от " + min + " до " + max + " составляет " + srAr);
        System.out.println("Среднее арифметическое четных чисел в интервале от " + min + " до " + max + " составляет " + srArChCh);
        }
    }