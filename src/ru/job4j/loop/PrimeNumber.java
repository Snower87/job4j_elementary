package ru.job4j.loop;

/**
 * @Раздел Блок 1. Базовый Синтаксис. / 4. Циклы.
 * @Задание 5.6. Простые числа. [156314#271456]
 * @Описание 1. Создайте класс ru.job4j.loop.PrimeNumber
 * 2. Реализуйте метод, который посчитает количество простых чисел от 1 до finish.
 *    В предыдущем задании вы уже реализовали класс для проверки того, является ли число простым.
 *    Мы можем использовать класс CheckPrimeNumber для решения этой задачи.
 * 3. Протестируйте код в junit.
 * 4. Загрузите код в github. Оставьте ссылку на коммит.
 * @author Sergei Begletsov
 * @since 26.04.2020
 * @version 1
 */

public class PrimeNumber {
    public static int calc(int finish) {
        int count = 0;
        for (int number = 2; number <= finish; number++) {
            if (CheckPrimeNumber.check(number)) {
                count++;
            }
        }
        return count;
    }
}
