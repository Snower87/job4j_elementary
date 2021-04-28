package ru.job4j.array;

/**
 * @Раздел Блок 1. Базовый Синтаксис. / 5. Массивы.
 * @Задание 6.0.1. Объявление массива. [3613#271402]
 * @Описание 1. Создайте класс ru.job4j.loop.ArrayDefinition
 * 2. Создайте в нем метод main.
 * 3. Внутри метода main создайте три переменных.
 *     - Массив на 10 элементов типа short с именем ages.
 *     - Массив на 100500 элементов типа String c именем surnames.
 *     - Массив на 40 элементов типа float с именем prices.
 * 5. Загрузите код в github. Оставьте ссылку на коммит.
 * @author Sergei Begletsov
 * @since 28.04.2020
 * @version 1
 */

public class ArrayDefinition {
    public static void main(String[] args) {
        // Массив на 10 элементов типа short с именем ages.
        short[] ages = new short[10];
        // Массив на 100500 элементов типа String c именем surnames.
        String[] surnames = new String[100500];
        // Массив на 40 элементов типа float с именем prices.
        float[] prices = new float[40];
    }
}
