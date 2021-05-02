package ru.job4j.array;

/**
 * @Раздел Блок 1. Базовый Синтаксис. / 5. Массивы.
 * @Задание 6.5.3. Сортировка выборкой. [156320#271388]
 * @Описание 1. Необходимо создать класс ru.job4j.array.SortSelected и реализовать метод public static int[] sort(int[] data),
 *  где data - массив чисел, который нужно отсортировать по возрастанию.
 * Внутри метода нужно создать цикл for для передвижения по элементам.
 * В этом задании мы будем использовать методы, которые уже реализовывали в других задачах.
 *      a. MinDiapason.findMin - этот метод нужен для получения минимально элемента в массиве.
 *      b. FindLoop.indexOf(int[] data, int el, int start, int finish) - этот метод нужен, чтобы получить индекс элемента,
 *      полученного из метода MinDiapason.findMin. Этот метод был реализован в предыдущей задаче.
 * 2. В результате выполнения метод должен отсортировать входной массив методом "выборка" по-возрастанию.
 * 3. Протестируйте код в junit.
 * 4. Залейте код в git-репозиторий, оставьте ссылку на коммит.
 * @author Sergei Begletsov
 * @since 02.05.2020
 * @version 1
 */

public class SortSelected {
    /**
     * Осуществляет сортировку входного массива методом "выборка"
     * @param data входной массив
     * @return возвращает отсортированный массив
     */
    public static int[] sort(int[] data) {
        for (int i = 0; i < data.length; i++) {
            int min = MinDiapason.findMin(data, i, data.length - 1);
            int index = FindLoop.indexOf(data, min, i, data.length - 1);
            //swap(...)
            int temp = data[i];
            data[i] = min;
            data[index] = temp;
        }
        return data;
    }
}
