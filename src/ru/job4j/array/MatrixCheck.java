package ru.job4j.array;

/**
 * @Раздел Блок 1. Базовый Синтаксис. / 5. Массивы.
 * @Задание 6.7.1. Моно строка в матрице. [214126#271391]
 * @Описание 1. Необходимо создать класс ru.job4j.array.MatrixCheck и реализовать метод public static boolean monoHorizontal(char[][] board, int row),
 * который проверяет заполнение строки входного двумерного массива на символ 'X'.
 * 2. Протестируйте код в junit.
 * 3. Залейте код в git-репозиторий, оставьте ссылку на коммит.
 * @author Sergei Begletsov
 * @since 03.05.2020
 * @version 1
 */

public class MatrixCheck {
    /**
     * Проверяет строку входной таблицы на заполнение символом 'X'
     * @param board входной двумерный массив
     * @param row строка в коротой происходит поиск сивола 'X'
     * @return true - если в строке все символы, false - если нет символов/не полное кол-во
     */
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;

        //если на входе двумерный массив, то получим его размеры
        int rows = board.length;
        int columns = board[0].length;

        for (int cols = 0; cols < columns; cols++) {
            if (board[row][cols] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }
}
