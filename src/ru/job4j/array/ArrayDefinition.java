package ru.job4j.array;

/**
 * @Раздел Блок 1. Базовый Синтаксис. / 5. Массивы.
 * @Задание 6.0.1.1. Размер массива. [#333582] (ver. 3)
 * @Описание 1. В методе main к каждому созданному массиву добавьте вывод в консоль размера объявленного массива.
 * 5. Загрузите код в github. Оставьте ссылку на коммит.
 *
 * @Раздел Блок 1. Базовый Синтаксис. / 5. Массивы.
 * @Задание 6.0.2. Заполнение массива. [226300#271394] (ver. 2)
 * @Описание 1.  Внутри метода main создайте массив String на 4 ячейки. Дайте имя переменной созданного массива - names.
 * 2. Заполните массив произвольными именами.
 *    Заполнение производить через обращение по индексу.
 *      Например: names[0] = "Petr Arsentev";
 * 3. После этого выведите каждую ячейку на консоль.
 * 4. Загрузите код в github. Оставьте ссылку на коммит.
 *
 * @Раздел Блок 1. Базовый Синтаксис. / 5. Массивы.
 * @Задание 6.0.1. Объявление массива. [3613#271402] (ver. 1)
 * @Описание 1. Создайте класс ru.job4j.loop.ArrayDefinition
 * 2. Создайте в нем метод main.
 * 3. Внутри метода main создайте три переменных.
 *     - Массив на 10 элементов типа short с именем ages.
 *     - Массив на 100500 элементов типа String c именем surnames.
 *     - Массив на 40 элементов типа float с именем prices.
 * 5. Загрузите код в github. Оставьте ссылку на коммит.
 * @author Sergei Begletsov
 * @since 28.04.2020
 * @version 3
 */

public class ArrayDefinition {
    public static void main(String[] args) {
        // Массив на 10 элементов типа short с именем ages.
        short[] ages = new short[10];
        // Массив на 100500 элементов типа String c именем surnames.
        String[] surnames = new String[100500];
        // Массив на 40 элементов типа float с именем prices.
        float[] prices = new float[40];

        String[] names = new String[5];
        names[0] = "Ivan Navigator";
        names[1] = "Peter Pan";
        names[2] = "David Karpov";
        names[3] = "Failer Enaibler";
        names[4] = "Peter Navinsgton";

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        System.out.println();
        System.out.println("ages length: " + ages.length);
        System.out.println("surnames length: " + surnames.length);
        System.out.println("prices length: " + prices.length);
    }
}
