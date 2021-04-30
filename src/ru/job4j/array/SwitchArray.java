package ru.job4j.array;

/**
 * @Раздел Блок 1. Базовый Синтаксис. / 5. Массивы.
 * @Задание 6.2.2. Переставить элементы массива. [226795#271399] (ver.2)
 * @Описание 1. Доработаем класс ru.job4j.array.SwitchArray, добавим и реализуем метод
 *   public static int[] swap(int[] array, int source, int dest)
 * 2. Метод работает таким образом, чтобы значение ячеек с индексами source и dest поменялись местами. При этом:
 *      - source указывает на индекс элемента, который будет записан в ячейку с индексом dest;
 *      - dest указывает на индекс элемента, который будет записан в ячейку с индексом source;
 * 3. Протестируйте код в junit.
 * 4. Залейте код в репозиторий, оставьте ссылку на коммит.
 *
 * @Раздел Блок 1. Базовый Синтаксис. / 5. Массивы.
 * @Задание 6.2.1. Выход за границу массива. [226794#271398] (ver. 1)
 * @Описание 1. Создайте класс ru.job4j.array.SwitchArray, скопируйте метод public static int[] swapBorder(int[] array)
 * и код из задания.
 * 2. Метод swapBorder() падает с ошибкой java.lang.ArrayIndexOutOfBoundsException. Ваша задача устранить эту ошибку.
 * 3. Залейте код в репозиторий, оставьте ссылку на коммит.
 * @author Sergei Begletsov
 * @since 30.04.2020
 * @version 2
 */

public class SwitchArray {
    /**
     * Меняем местами source и dest-элементы в массиве
     * @param array указатель/ссылка на входной массив
     * @param source индекс элемента 1
     * @param dest индекс элемента 2
     * @return указатель на тот же массив после перастановки элементов
     */
    public static int[] swap(int[] array, int source, int dest) {
        int temp = array[source];
        array[source] = array[dest];
        array[dest] = temp;
        return array;
    }

    /**
     * Метод меняет местами нулевой элемент и последний элемент в массиве
     * @param array - входной массив
     * @return возвращает массив после престановки элементов
     */
    public static int[] swapBorder(int[] array) {
        int temp = array[0];
        array[0] = array[array.length - 1];
        array[array.length - 1] = temp;
        return array;
    }

    public static void main(String[] args) {
        int[] nums = new int[] {1, 2, 3, 4, 5, 6};
        int[] rsl = swapBorder(nums);
        System.out.println("length = " + rsl.length);
        for (int index = 0; index < rsl.length; index++) {
            System.out.println(rsl[index]);
        }
    }
}
