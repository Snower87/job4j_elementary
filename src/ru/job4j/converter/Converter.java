package ru.job4j.converter;

/**
 * @Раздел Блок 1. Базовый Синтаксис. / 1. Тип данных.
 * @Задание 5. Конвертер валюты. [41583#271405]
 * @Описание 1. Реализовать метод конвертации рублей в евро и доллары.
 * Вам нужно заменить -1 на формулу для вычисления валюты. *
 *      1 доллар = 60 рублей.
 *      1 евро = 70 рублей.
 * 2. Доработайте метод main. Добавьте в него примеры выводов всех видов конвертаций.
 * 3. Загрузите изменения на сайт github. Оставьте ссылку на изменения.
 * @author Sergei Begletsov
 * @since 19.04.2020
 * @version 1
 */

public class Converter {
    public static int rubleToEuro(int value) {
        int rsl = value / 70; // формула перевода рублей в евро.
        return rsl;
    }

    public static int rubleToDollar(int value) {
        int rsl = value / 60; // формула перевода рублей в доллары.
        return rsl;
    }

    public static void main(String[] args) {
        int euro = Converter.rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");

        int dollar = Converter.rubleToDollar(1800);
        System.out.println("1800 rubles are " + dollar + " $.");
    }
}
