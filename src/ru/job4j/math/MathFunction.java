package ru.job4j.math;

/**
 * @Раздел Блок 1. Базовый Синтаксис. / 2. Тестирование.
 * @Задание 1.1. Что такое import. [#504773]
 * @Описание 1. В класс MathFunction добавьте еще 2 метода, которые будут рассчитывать разность и деление двух чисел соответственно.
 * 2. В класс MathCalculator добавьте еще 2 метода (имена методов придумайте самостоятельно):
 * - один будет считать сумму двух операций из класса MathFunction: разность двух чисел и деление двух чисел.
 * - второй метод будет рассчитывать сумму вычисления всех четырех операций из класса MathFunction.
 * Не забудьте о использовании статического импорта.
 * 3. Загрузите файл на сайт github.com и оставьте ссылку на изменения.
 * @author Sergei Begletsov
 * @since 20.07.2021
 * @version 1
 */

public class MathFunction {
    /**
     * Метод считает сумму двух чисел
     * @param first первое число
     * @param second второе число
     * @return сумма чисел
     */
    public static double sum(double first, double second) {
        return first + second;
    }

    /**
     * Метод считает умножение двух чисел
     * @param first первое число
     * @param second второе число
     * @return умножение двух чисел
     */
    public static double multiply(double first, double second) {
        return first * second;
    }

    /**
     * Метод считает разность двух чисел
     * @param first первое число
     * @param second второе число
     * @return разность двух чисел
     */
    public static double subtraction(double first, double second) {
        return first - second;
    }

    /**
     * Метод считает деление двух чисел
     * @param first первое число
     * @param second второе число
     * @return деление двух чисел
     */
    public static double division(double first, double second) {
        return first / second;
    }
}