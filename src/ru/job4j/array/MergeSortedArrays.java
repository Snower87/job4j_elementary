package ru.job4j.array;

/**
 * @Задание Объединить два отсортированных массива. MergeSortedArrays. [#124482]
 * @Описание Даны два отсортированных по возрастанию массива. Как без сортировки их объединить в третий массив?
 * @author Sergei Begletsov
 * @since 05.05.2021
 * @version 1
 */

public class MergeSortedArrays {
    /**
     * Объединяет два отсортированных массива
     * @param left ссылка на 1ый отсортированный массив
     * @param right ссылка на 2ой отсортированный массив
     * @return возвращает отсортированный массив длина которого сумма 1го и 2го
     */
    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];

        int indexRsl = 0;   //индекс в массиве rsl
        int indexLeft = 0;  //индекс в массиве left
        int indexRight = 0; //индекс в массиве right

        //формирование основной части
        while (indexLeft < left.length && indexRight < right.length) {
            rsl[indexRsl++] = left[indexLeft] < right[indexRight] ? left[indexLeft++] : right[indexRight++];
        }

        //формирование остатка
        while (indexLeft < left.length) {
            rsl[indexRsl++] = left[indexLeft++];
        }

        while (indexRight < right.length) {
            rsl[indexRsl++] = right[indexRight++];
        }

        return rsl;
    }
}
