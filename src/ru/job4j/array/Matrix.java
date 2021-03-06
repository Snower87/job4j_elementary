package ru.job4j.array;

/**
 * @Раздел Блок 1. Базовый Синтаксис. / 5. Массивы.
 * @Задание 6.6.2. Двухмерный массив. Таблица умножения. [33491#271381]
 * @Описание 1. Необходимо создать класс ru.job4j.array.Matrix и реализовать метод public static int[][] multiple(int size), где:
 * size - указывает на размер таблицы. В ячейки массива нужно записать элементы таблицы умножения.
 * Элементы получать путем перемножения индексов.
 * 3. Протестируйте код в junit.
 * 4. Залейте код в git-репозиторий, оставьте ссылку на коммит.
 * @author Sergei Begletsov
 * @since 02.05.2020
 * @version 1
 */

public class Matrix {
    /**
     * Создает таблицу умножения заданного рамера
     * @param size размер двумерного массива (таблицы умножения)
     * @return возвращает таблицу умножения заданного размера (size)
     */
    public static int[][] multiple(int size) {
        int[][] table = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                table[i][j] = (i + 1) * (j + 1);
            }
        }
        return table;
    }
}
