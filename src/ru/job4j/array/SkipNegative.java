package ru.job4j.array;

/**
 * @Раздел Блок 1. Базовый Синтаксис. / 5. Массивы.
 * @Задание 6.6.3. Двухмерный массив. If. [#306727]
 * @Описание 1. Ниже приведен каркас класса. Метод skip должен заменить отрицательные значения в массиве на ноль.
 * 2. Протестируйте код в junit.
 * 3. Залейте код в репозиторий, оставьте ссылку на коммит.
 * @author Sergei Begletsov
 * @since 22.07.2021
 * @version 1
 */

public class SkipNegative {
    public static int[][] skip(int[][] array) {
        for (int row = 0; row < array.length; row++) {
            for (int cell = 0; cell < array[row].length; cell++) {
                if (array[row][cell] < 0) {
                    array[row][cell] = 0;
                }
            }
        }
        return array;
    }
}
