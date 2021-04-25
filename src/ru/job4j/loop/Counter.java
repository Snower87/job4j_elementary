package ru.job4j.loop;

/**
 * @Раздел Блок 1. Базовый Синтаксис. / 4. Циклы.
 * @Задание 5.1. Подсчет суммы чётных чисел в диапазоне. [192#271462] (ver.2)
 * @Описание 1. Добавьте в класс ru.job4j.loop.Counter метод public static int sumByEven(int start, int finish).
 * 2. Метод должен вычислять сумму четныx чисел в диапазоне от start до finish.
 * 3. Добавьте тесты для проверки полученных результатов.
 * 4. Загрузите код в github. Оставьте ссылку на коммит.
 *
 * @Раздел Блок 1. Базовый Синтаксис. / 4. Циклы.
 * @Задание 5.0.1. Сумма чисел. [226416#271460] (ver.1)
 * @Описание 1. Создайте класс ru.job4j.loop.Counter
 * 2. Напишите программу, которая будет подсчитывать сумму чисел от start до finish. Например:
 *      start = 0, finish = 5. Нужно сложить числа: 0, 1, 2, 3, 4, 5. Ответ будет 15.
 * 3. Загрузите код в github. Оставьте ссылку на коммит.
 * @author Sergei Begletsov
 * @since 25.04.2020
 * @version 2
 */

public class Counter {
    public static int sum(int start, int finish) {
        int sum = 0;
        for (int index = start; index <= finish; index++) {
            sum = sum + index;
        }
        return sum;
    }

    public static int sumByEven(int start, int finish) {
        int sum = 0;
        for (int index = start; index <= finish; index++) {
            if ((index % 2) == 0) {
                sum = sum + index;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sum(0, 5));
        System.out.println(sum(3, 8));
        System.out.println(sum(1, 1));

        System.out.println(sum(2, 3));
        System.out.println(sum(1, 5));

        System.out.println("summa numbers % 2:");
        System.out.println(sumByEven(0, 10));
        System.out.println(sumByEven(3, 8));
        System.out.println(sumByEven(1, 1));
    }
}
