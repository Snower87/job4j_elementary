package ru.job4j.array;

/**
 * @Раздел Блок 1. Базовый Синтаксис. / 5. Массивы.
 * @Задание 6.1. Классический поиск перебором. [33489#271380]
 * @Описание 1. Создайте класс ru.job4j.array.FindLoop и реализуйте метод поиска элемента в массиве
 *   public static int indexOf(int[] data, int el)
 * 2. На входе нас задан массив элементов, и нам необходимо найти индекс элемента, удовлетворяющего условию.
 *    Решение этой задачи сводится к последовательному перебору каждого элемента. Если элемент подходит под условие,
 *    мы останавливаем цикл и возвращаем индекс нашего элемента.
 * 3. Протестируйте код в junit.
 * 4. Залейте код в репозиторий, оставьте ссылку на коммит.
 * @author Sergei Begletsov
 * @since 30.04.2020
 * @version 1
 */

public class FindLoop {
    /**
     * Создает массив чисел и возводит их в квадрат
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
}
