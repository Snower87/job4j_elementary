package ru.job4j.array;

/**
 * @Раздел Блок 1. Базовый Синтаксис. / 5. Массивы.
 * @Задание 6.2. Упорядочить массив. [4441#271403]
 * @Описание 1. Создайте класс ru.job4j.array.AlgoArray и реализуйте в main'e перестановку элементов
 * через временную переменную temp и индексы массива
 * 2. Залейте код в репозиторий, оставьте ссылку на коммит.
 * @author Sergei Begletsov
 * @since 30.04.2020
 * @version 1
 */

public class AlgoArray {
    public static void main(String[] args) {
        int[] array = new int[] {5, 3, 2, 1, 4};
        int temp = array[0]; // переменная для временного хранения значение ячейки с индексом 0.
        array[0] = array[3]; // записываем в ячейку с индексом 0 значение ячейки с индексом 3.
        array[3] = temp; // записываем в ячейку с индексом 3 значение временной переменной.

        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]);
        }

        //меняем местами индексы 1 и 2
        temp = array[1];
        array[1] = array[2];
        array[2] = temp;

        //меняем местами индексы 3 и 4
        temp = array[3];
        array[3] = array[4];
        array[4] = temp;

        System.out.println("После сортировки:");
        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]);
        }
    }
}
