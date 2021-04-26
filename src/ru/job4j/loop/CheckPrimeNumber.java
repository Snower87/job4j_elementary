package ru.job4j.loop;

/**
 * @Раздел Блок 1. Базовый Синтаксис. / 4. Циклы.
 * @Задание 5.5. Простое число. [171694#271458]
 * @Описание 1. Создайте класс ru.job4j.loop.CheckPrimeNumber
 * 2. В классе ru.job4j.loop.CheckPrimeNumber напишите метод: public static boolean check(int number)
 *    Метод должен вернуть true, если переменная number является простым числом.
 *    Простым считается число, которое делится только на себя и на единицу.
 * 3. Протестируйте код в junit.
 * 4. Загрузите код в github. Оставьте ссылку на коммит.
 * @author Sergei Begletsov
 * @since 26.04.2020
 * @version 1
 */

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = number > 1;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                prime = false;
                break;
            }
        }
        return prime;
    }
}
