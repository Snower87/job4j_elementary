package ru.job4j.calculator;

/**
 * @Раздел Блок 1. Базовый Синтаксис. / 1. Тип данных.
 * @Задание 3. Арифметические операции. [185#271417]
 * @Описание 1. В методе main создайте дополнительные переменные, кроме тех, что уже созданы.
 *  - переменную типа int c именем six и значением 6.
 *  - переменную типа int c именем four и значением 4.
 *  - переменную типа int с именем five и значением 5.
 * 2. Создайте еще три переменные для хранения результата арифметических операций.
 *   - переменную типа int c именем sixDivTwo и присвойте ей значение арифметической операции деления переменной six на two.
 *   - переменную типа int c именем fiveMinusTwo и присвойте ей значение арифметической операции вычитания переменной five c two.
 *   - переменную типа int c именем fourTimeTwo и присвойте ей значение арифметической операции умножения переменной four на two.
 * 3. Выведите на консоль переменные sixDivTwo, fiveMinusTwo, fourTimeTwo.
 * 4. Загрузите файл ru.job4j.calculator.Calculator на сайт github.com и оставьте ссылку на изменения.
 * @author Sergei Begletsov
 * @since 18.04.2020
 * @version 1
 */

public class Calculator {
    public static void main(String[] args) {
        int one = 1;
        int two = 2;
        int onePlusTwo = one + two;
        System.out.println(onePlusTwo);

        int six = 6;
        int four = 4;
        int five = 5;

        int sixDivTwo = six / two;
        int fiveMinusTwo = five - two;
        int fourTimeTwo = four * two;

        System.out.println("sixDivTwo = " + sixDivTwo);
        System.out.println("fiveMinusTwo = " + fiveMinusTwo);
        System.out.println("fourTimeTwo = " + fourTimeTwo);
    }
}
