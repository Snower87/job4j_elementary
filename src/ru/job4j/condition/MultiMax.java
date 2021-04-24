package ru.job4j.condition;

/**
 * @Раздел Блок 1. Базовый Синтаксис. / 3. Оператор ветвления.
 * @Задание 4.4.1 Максимум из трех чисел. [#271375]
 * @Описание 1. Создайте класс ru.job4j.condition.MultiMax. (см. описание)
 * 2. Реализуйте метод public int max(int first, int second, int third),
 * который должен найти максимальное число из 3х переданных в методе,
 * для сравнения чисел между собой используйте тернарный оператор.
 * 3. Загрузите код в github. Оставьте ссылку на коммит.
 * @author Sergei Begletsov
 * @since 24.04.2020
 * @version 1
 */

public class MultiMax {
    public int max(int first, int second, int third) {
        int result = first >= second ? first : second;
        result = result >= third ? result : third;
        return result;
    }
}
