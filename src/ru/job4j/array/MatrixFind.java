package ru.job4j.array;

/**
 * @Раздел Блок 1. Базовый Синтаксис. / 5. Массивы.
 * @Задание 6.6.3. Двухмерный массив. If. [#306727]
 * @Описание 1. Практика работы с двумерными массивами (по описанию к задаче).
 * 2. Залейте код в репозиторий, оставьте ссылку на коммит.
 * @author Sergei Begletsov
 * @since 22.07.2021
 * @version 1
 */

public class MatrixFind {
    public static void find(int[][] array, int el) {
        System.out.println("Find el : " + el);
        for (int row = 0; row < array.length; row++) {
            for (int cell = 0; cell < array.length; cell++) {
                int val = array[row][cell];
                if (val == el) {
                    System.out.println("row : " + row + ", cell : " + cell);
                }
            }
        }
    }

    public static void main(String[] args) {
        int[][] array = {
                {1, 2, 3},
                {3, 2, 1},
                {2, 3, 1}
        };
        MatrixFind.find(array, 3);
    }
}
