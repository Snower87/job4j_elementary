package ru.job4j.array;

/**
 * @Раздел Блок 1. Базовый Синтаксис. / 5. Массивы.
 * @Задание 6.5.2. Поиск минимума в диапазоне. [179804#271390]
 * @Описание 1. Необходимо создать класс ru.job4j.array.Min и реализовать метод public static int findMin(int[] array).
 * 2. В результате выполнения метод должен найти минимальное число во входном массиве.
 * 3. Протестируйте код в junit.
 * 4. Залейте код в git-репозиторий, оставьте ссылку на коммит.
 * @author Sergei Begletsov
 * @since 02.05.2020
 * @version 1
 */

public class MinDiapason {
    /**
     * Осуществляет поиск минимального значения элемента из входного массива (в диапазоне индексов start-finish)
     * @param array ссылка на входной массив
     * @param start индекс начала поиска
     * @param finish индекс конца поиска
     * @return min значение начиная с array[start] до array[finish]
     */
    public static int findMin(int[] array, int start, int finish) {
        int min = array[start];
        for (int i = start; i <= finish; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }
}
