package ru.job4j.array;

/**
 * @Раздел Блок 1. Базовый Синтаксис. / 5. Массивы.
 * @Задание 6.7.1. Моно строка в матрице. [214126#271391] (ver. 1)
 * @Описание 1. Необходимо создать класс ru.job4j.array.MatrixCheck и реализовать метод public static boolean monoHorizontal(char[][] board, int row),
 * который проверяет заполнение строки входного двумерного массива на символ 'X'.
 * 2. Протестируйте код в junit.
 * 3. Залейте код в git-репозиторий, оставьте ссылку на коммит.
 *
 * @Раздел Блок 1. Базовый Синтаксис. / 5. Массивы.
 * @Задание 6.7.2. Моно столбец в матрице. [214127#271392] (ver. 2)
 * @Описание 1. Необходимо доработать класс ru.job4j.array.MatrixCheck и реализовать метод public static boolean monoVertical(char[][] board, int column),
 * который проверяет заполнение столбца входного двумерного массива на символ 'X'.
 * 2. Добавьте тесты. Протестируйте код в junit.
 * 3. Залейте код в git-репозиторий, оставьте ссылку на коммит.
 *
 * @Раздел Блок 1. Базовый Синтаксис. / 5. Массивы.
 * @Задание 6.7.3. Массив из диагонали матрицы. [214128#271393] (ver. 3)
 * @Описание 1. Необходимо доработать класс ru.job4j.array.MatrixCheck и реализовать метод public static char[] extractDiagonal(char[][] board),
 * который должен заполнить выходной одномерный массив элементами диагонали из двухмерного входного массива.
 * 2. В этом задании вам нужен только один цикл for с индексом. Элементы диагонали будут иметь одинаковое значение индексов.
 * Диагональю в этом задании считается элементы лежащие на линии, проведенной от левого верхнего угла в нижний правый.
 * 3. Добавьте тесты. Протестируйте код в junit.
 * 4. Залейте код в git-репозиторий, оставьте ссылку на коммит.
 * @author Sergei Begletsov
 * @since 03.05.2020
 * @version 3
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

    /**
     * Проверяет столбец входной таблицы на заполнение символом 'X'
     * @param board ссылка на входной массив
     * @param column столбец в коротой происходит поиск сивола 'X'
     * @return true - если в столбце есть все символы, false - если нет символов/не полное кол-во
     */
    public static boolean monoVertical(char[][] board, int column) {
        boolean result = true;

        //если на входе двумерный массив, то получим его размеры
        int rows = board.length;
        int columns = board[0].length;

        for (int row = 0; row < rows; row++) {
            if (board[row][column] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }

    /**
     * Заполняет выходной одномерный массив значением диагонали у таблицы
     * @param board ссылка на входной массив
     * @return массив значений по диагонали у входной таблицы
     */
    public static char[] extractDiagonal(char[][] board) {
        char[] rsl = new char[board.length];
        for (int index = 0; index < rsl.length; index++ ) {
            rsl[index] = board[index][index];
        }
        return rsl;
    }
}
