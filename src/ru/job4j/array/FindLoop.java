package ru.job4j.array;

/**
 * @Раздел Блок 1. Базовый Синтаксис. / 5. Массивы.
 * @Задание 6.1. Классический поиск перебором. [33489#271380] (ver. 1)
 * @Описание 1. Создайте класс ru.job4j.array.FindLoop и реализуйте метод поиска элемента в массиве
 *   public static int indexOf(int[] data, int el)
 * 2. На входе нас задан массив элементов, и нам необходимо найти индекс элемента, удовлетворяющего условию.
 *    Решение этой задачи сводится к последовательному перебору каждого элемента. Если элемент подходит под условие,
 *    мы останавливаем цикл и возвращаем индекс нашего элемента.
 * 3. Протестируйте код в junit.
 * 4. Залейте код в репозиторий, оставьте ссылку на коммит.
 *
 * @Раздел Блок 1. Базовый Синтаксис. / 5. Массивы.
 * @Задание 6.5. Поиск индекса в диапазоне. [156318#271387] (ver. 2)
 * @Описание 1. В классе ru.job4j.array.FindLoop добавьте и реализуйте метод поиска элемента в массиве, но не во всем массиве,
 * а только в указанном диапазоне: public static int indexOf(int[] data, int el, int start, int finish), где
 *     data - массив чисел,
 *     el - элемент, который нужно найти,
 *     start - индекс, с которого начинаем поиск,
 *     finish - индекс, которым заканчиваем поиск.
 * 2. Добавьте тесты для нового метода. Протестируйте код в junit.
 * 3. Залейте код в репозиторий, оставьте ссылку на коммит.

 * @author Sergei Begletsov
 * @since 30.04.2020
 * @version 2
 */

public class FindLoop {
    /**
     * Осуществляет поиск элемента из входного массива
     * @param data ссылка на входной массив
     * @param el элемент (число) которое ищем во входном массиве
     * @return индекс найденного элемента
     */
    public int indexOf(int[] data, int el) {
        int rst = -1; // если элемента нет в массиве, то возвращаем -1.
        for (int index = 0; index < data.length; index++) {
            if (data[index] == el) {
                rst = index;
                break;
            }
        }
        return rst;
    }

    /**
     * Осуществляет поиск элемента из входного массива (в диапазоне start-finish)
     * @param data ссылка на входной массив
     * @param el элемент (число) которое ищем во входном массиве
     * @param start индекс начала поиска
     * @param finish индекс конца поиска
     * @return -1 если индекс не найден, или (индекс) найденного элемента
     */
    public static int indexOf(int[] data, int el, int start, int finish) {
        int rst = -1; // если элемента нет в массиве, то возвращаем -1.
        for (int index = start; index <= finish; index++) {
            if (data[index] == el) {
                rst = index;
                break;
            }
        }
        return rst;
    }
}
