package ru.job4j.calculator;

/**
 * @Раздел Блок 1. Базовый Синтаксис. / 1. Тип данных.
 * @Задание 4. Методы. [231984#271413] (version 2)
 * @Описание 1. Напишите код, который вызывает метод plus с аргументами 100 и 500, 4 и 2, 3 и 5.
 * 2. Загрузите файл на сайт github.com и оставьте ссылку на изменения.
 * @author Sergei Begletsov
 * @since 18.04.2020
 * @version 2
 */

public class Calculator {
    public static void plus(int first, int second) {
        int result = first + second;
        System.out.println(result);
    }

    public static void main(String[] args) {
        Calculator.plus(100, 500);
        Calculator.plus(4, 2);
        Calculator.plus(3, 5);
    }
}
