package ru.job4j.condition;

/**
 * @Раздел Блок 1. Базовый Синтаксис. / 2. Тестирование.
 * @Задание 1.2. Входные данные в тесте. [#297750]
 * @Описание 1. Добавьте методы тестирования по аналогии с методом whenA10B0C0X2Then40().
 * Укажите разные случаи входных параметров.
 * - a = 1, b = 1, c = 1, x = 1.
 * - a = 0, b = 1, c = 1, x = 1.
 * - a = 1, b = 1, c = 0, x = 1.
 * - a = 1, b = 1, c = 1, x = 0.
 * Переменную expected нужно вычислить для каждого случая отдельно.
 * 2. Загрузите файл на сайт github.com и оставьте ссылку на изменения.
 * @author Sergei Begletsov
 * @since 19.07.2021
 * @version 1
 */

public class X2 {
    public static int calc(int a, int b, int c, int x) {
        return a * x * x + b * x + c;
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        int c = 0;
        int x = 1;
        int rsl = X2.calc(a, b, c, x);
        System.out.println(rsl);
    }
}