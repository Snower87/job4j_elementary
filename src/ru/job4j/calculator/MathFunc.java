package ru.job4j.calculator;

/**
 * @Раздел Блок 1. Базовый Синтаксис. / 1. Тип данных.
 * @Задание 4.1. Результат работы метода. [232622#271415]
 * @Описание 1. Напишите код, который вызывает метод func1 с аргументом x = 100,
 * а результат вычисления функции записывает в переменную result.
 * 2. Загрузите файл на сайт github.com и оставьте ссылку на изменения.
 * @author Sergei Begletsov
 * @since 19.04.2020
 * @version 1
 */

public class MathFunc {
    public static int func1(int x) {
        int y = x * x + 1;
        return y;
    }

    public static int func2(int x) {
        int y = 1 / x;
        return y;
    }

    public static void main(String[] args) {
        int result1 = MathFunc.func1(3);
        int result2 = MathFunc.func1(5);
        int total = result1 + result2;
        System.out.println(total);

        int result = MathFunc.func1(100);
        System.out.println(result);
    }
}
