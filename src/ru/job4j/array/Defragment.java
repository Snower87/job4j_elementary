package ru.job4j.array;

/**
 * @Раздел Блок 1. Базовый Синтаксис. / 5. Массивы.
 * @Задание 6.8. Дефрагментация массива. [225#271401]
 * @Описание 1. Необходимо создать класс ru.job4j.array.Defragment и реализовать метод public static String[] compress(String[] array).
 * Необходимо написать код, который будет перемещать заполненные ячейки массива в начало, а пустые в конец.
 * 2. Массивы в Java создаются с фиксированной длиной. То есть добавить новую ячейку или удалить старую ячейку нельзя.
 * Можно только заполнить ячейку или освободить ее.
 * При работе с массивами будут возникать ситуации, когда в массиве часть ячеек будет заполнена, а часть - нет.
 * Заполненные ячейки могут быть разбросаны по всему массиву. Нам бы хотелось расположить все эти ячейки в начале массива.
 * Задача: Вам нужно добавить еще один цикл, который найдет не null ячейку - notNullIndex.
 * После этого нужно поменять ячейки местами swap(array, nullIndex, notNullIndex);
 * Для выполнения этой задачи нужно использовать: циклы for с индексом и оператор условия if.
 * 3. Протестируйте код в junit.
 * 4. Залейте код в git-репозиторий, оставьте ссылку на коммит.
 * @author Sergei Begletsov
 * @since 03.05.2020
 * @version 1
 */

public class Defragment {
    /**
     * Переносит все строки со значениями в начало, оставляя в конце null-строки
     * @param array указатель/ссылка на входной массив строк
     * @return отсортированный массив строк (в начале - значения, в конце - null-строки)
     */
    public static String[] compress(String[] array) {
        for (int index = 0; index < array.length; index++) {
            if (array[index] == null) {
                int point = index; // указатель, на null ячейку
                // Здесь нужен цикл while
                // для поиска в оставшейся части не null ячейки
                while (point < array.length) {
                    if (array[point] != null) {
                        String temp = array[point];
                        array[point] = array[index];
                        array[index] = temp;
                        break;
                    }
                    point++;
                }
            }
            System.out.print(array[index] + " ");
        }
        return array;
    }

    public static void main(String[] args) {
        String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
        String[] compressed = compress(input);
        System.out.println();
        for (int index = 0; index < compressed.length; index++) {
            System.out.print(compressed[index] + " ");
        }
    }
}
