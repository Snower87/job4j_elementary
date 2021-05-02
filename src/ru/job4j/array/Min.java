package ru.job4j.array;

/**
 * @Раздел Блок 1. Базовый Синтаксис. / 5. Массивы.
 * @Задание 6.5.1. Поиск минимального числа в массиве. [179803#271389]
 * @Описание 1. Необходимо создать класс ru.job4j.array.Min и реализовать метод public static int findMin(int[] array).
 * 2. В результате выполнения метод должен найти минимальное число во входном массиве.
 * 3. Протестируйте код в junit.
 * 4. Залейте код в git-репозиторий, оставьте ссылку на коммит.
 * @author Sergei Begletsov
 * @since 02.05.2020
 * @version 1
 */

public class Min {
    /**
     * Осуществляет поиск минимального значения
     * @param array ссылка на входной массив
     * @return min значение во всем массиве
     */
    public static int findMin(int[] array) {
        int min = array[0];
        for (int index = 0; index < array.length; index++) {
            // проверить, что эталон больше, чем элемент. записать в эталон элемент массива.
            if (min > array[index]) {
                min = array[index];
            }
        }
        return min;
    }
}
