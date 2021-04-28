package ru.job4j.array;

/**
 * @Раздел Блок 1. Базовый Синтаксис. / 5. Массивы.
 * @Задание 6.0.3. Массивы и цикл for. [226665#271395]
 * @Описание 1. Создайте класс ru.job4j.array.ArrayLoop. В нем создайте метод main
 * 2. Внутри метода main объявите массив int на 5 элементов. Через цикл for заполните его значениями функции y = index * 2 + 3;
 *      numbers[index] = index * 2 + 3;
 * 3. Ниже, через цикл for выведите все элементы массива на консоль.
 * 4. Залейте код в репозиторий, оставьте ссылку на коммит.
 * @author Sergei Begletsov
 * @since 28.04.2020
 * @version 1
 */

public class ArrayLoop {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        //1. Заполнение массива numbers числами по ф-ии
        for (int index = 0; index < numbers.length; index++) {
            numbers[index] = index * 2 + 3;
        }

        //2. Вывод на консоль
        for (int index = 0; index < numbers.length; index++) {
            System.out.println(numbers[index]);
        }
    }
}
