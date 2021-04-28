package ru.job4j.array;

/**
 * @Раздел Блок 1. Базовый Синтаксис. / 5. Массивы.
 * @Задание 6.0.4. Заполнить массив степенями чисел. [33488#271379]
 * @Описание 1. Создайте класс ru.job4j.array.Square. Добавьте и реализуйте в нем методы
 *  public static int[] calculate(int bound) и main, как показано в коде ниже.
 * 2. Аргументом метода является параметр bound. Он определяет, до какого числа нужно записывать числа.
 *    Например, если задается bound = 3, нужно возвести в квадрат числа 0, 1 и 2 и записать в массив числа 0, 1, 4.
 * 4. Залейте код в репозиторий, оставьте ссылку на коммит.
 * @author Sergei Begletsov
 * @since 28.04.2020
 * @version 1
 */

public class Square {
    public static int[] calculate(int bound) {
        int[] rst = new int[bound];
        // заполнить массив через цикл элементами от 0 до bound , возведенными в квадрат
        for (int index = 0; index < bound; index++) {
            rst[index] = (int) Math.pow(index, 2);
        }
        return rst;
    }

    public static void main(String[] args) {
        int[] array = calculate(4);
        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]);
        }
    }
}
