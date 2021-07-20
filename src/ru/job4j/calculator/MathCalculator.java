package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

/**
 * @Раздел Блок 1. Базовый Синтаксис. / 2. Тестирование.
 * @Задание 1.1. Что такое import. [#504773]
 * @Описание 1. Практира работы с import и пакетами (по описанию к задаче).
 * 2. Загрузите файл на сайт github.com и оставьте ссылку на изменения.
 * @author Sergei Begletsov
 * @since 20.07.2021
 * @version 2
 */

public class MathCalculator {
    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double subtractionAndDivision(double first, double second) {
        return subtraction(first, second)
                + division(first, second);
    }

    public static double useAll4ArithmeticOperations(double first, double second) {
        return sum(first, second)
                + multiply(first, second)
                + subtraction(first, second)
                + division(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета равен: " + subtractionAndDivision(10, 2));
        System.out.println("Результат расчета равен: " + useAll4ArithmeticOperations(19, 3));
    }
}
