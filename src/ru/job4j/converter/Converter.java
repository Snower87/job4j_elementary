package ru.job4j.converter;

/**
 * @Раздел Блок 1. Базовый Синтаксис. / 4. Циклы.
 * @Задание 5.8. JavaDoc. Code convention. [4087#271465] (ver. 3)
 * @Описание 1. Запустите плагин checkstyle в IDEA. Убедитесь, что в проекте нет ошибок по оформлению.
 * 2. Загрузите изменения в github. Оставьте ссылку на коммит.
 *
 * @Раздел Блок 1. Базовый Синтаксис. / 2. Тестирование.
 * @Задание 0. Что такое тестирование. [159431#271440] (ver. 2)
 * @Описание 1. Доработайте код в методе main класса ru.job4j.convert.Converter. Нужно добавить проверку остальных методов.
 * 2. Загрузите изменения на github. Оставьте ссылку на изменения в комментарии.
 *
 * @Раздел Блок 1. Базовый Синтаксис. / 1. Тип данных.
 * @Задание 5. Конвертер валюты. [41583#271405] (ver. 1)
 * @Описание 1. Реализовать метод конвертации рублей в евро и доллары.
 * Вам нужно заменить -1 на формулу для вычисления валюты. *
 *      1 доллар = 60 рублей.
 *      1 евро = 70 рублей.
 * 2. Доработайте метод main. Добавьте в него примеры выводов всех видов конвертаций.
 * 3. Загрузите изменения на сайт github. Оставьте ссылку на изменения.
 * @author Sergei Begletsov
 * @since 19.04.2020
 * @version 3
 */

public class Converter {
    /**
     * Перевод рублей -> в евро
     * @param value сумма в рублях
     * @return сумма в евро
     */
    public static int rubleToEuro(int value) {
        int rsl = value / 70; // формула перевода рублей в евро.
        return rsl;
    }

    /**
     * Перевод рублей -> в доллары
     * @param value сумма в рублях
     * @return сумма в долларах
     */
    public static int rubleToDollar(int value) {
        int rsl = value / 60; // формула перевода рублей в доллары.
        return rsl;
    }

    public static void main(String[] args) {
        int euro = Converter.rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");

        int dollar = Converter.rubleToDollar(1800);
        System.out.println("1800 rubles are " + dollar + " $.");

        //тестирование, переменные:
        //in - входные данные.
        //expected - ожидаемое значение.
        //out - результат работы программы.
        //passed - результат сравнения переменных expected и out.
        //Принимает значение истина, если переменная expected равна переменной out.

        int in = 140;
        int expected = 2;
        int out = rubleToEuro(in);
        boolean passed = out == expected;
        System.out.println("140 rubles are 2 euro. Test result : " + passed);

        in = 180;
        expected = 3;
        out = rubleToDollar(in);
        passed = out == expected;
        System.out.println("180 rubles are 3 dollar. Test result : " + passed);
    }
}
