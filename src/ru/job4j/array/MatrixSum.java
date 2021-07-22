package ru.job4j.array;

/**
 * @Раздел Блок 1. Базовый Синтаксис. / 5. Массивы.
 * @Задание 6.6.2. Двухмерный массив. Циклы. [#306725]
 * @Описание 1. Ниже приведен каркас класса. Метод sum должен сложить все элементы двухмерного массива.
 * 2. Протестируйте код в junit.
 * 3. Залейте код в репозиторий, оставьте ссылку на коммит.
 * @author Sergei Begletsov
 * @since 22.07.2021
 * @version 1
 */

public class MatrixSum {
    public static int sum(int[][] array) {
        int rsl = 0;
        for (int row = 0; row < array.length; row++) {
            for (int cell = 0; cell < array[row].length; cell++) {
                rsl += array[row][cell];
            }
        }
        return rsl;
    }
}
