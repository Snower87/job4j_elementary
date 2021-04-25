package ru.job4j.loop;

/**
 * @Раздел Блок 1. Базовый Синтаксис. / 4. Циклы.
 * @Задание 5.4. Протеиновая диета. [156313#271455]
 * @Описание 1. Создайте класс ru.job4j.loop.Fitness
 * 2. В классе Fitness написать метод public static int calc(int ivan, int nik)
 * 3. Метод должен вычислять количество месяцев, которое необходимо Ивану, чтобы обогнать в тяге Николая.
 *    Вы должны использовать цикл while. В условие цикла нужно сравнивать тягу Ивана и Николая -
 *    если тяга Ивана больше, нужно выйти из цикла.
 * 4. Протестируйте код в junit.
 * 5. Загрузите код в github. Оставьте ссылку на коммит.
 * @author Sergei Begletsov
 * @since 25.04.2020
 * @version 1
 */

public class Fitness {
    public static int calc(int ivan, int nik) {
        int month = 0;
        while (ivan <= nik) {
            ivan *= 3;
            nik *= 2;
            month++;
        }
        return month;
    }
}
