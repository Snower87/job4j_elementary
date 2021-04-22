package ru.job4j.condition;

/**
 * @Раздел Блок 1. Базовый Синтаксис. / 3. Оператор ветвления.
 * @Задание 0. Операции сравнения. [235631#271371]
 * @Описание 1. Создайте класс ru.job4j.condition.Liken (код в описании к задаче)
 * 2. В переменную result запишите результат сравнения переменных first и second.
 *   - сравнить, что first больше second.
 *   - сравнить, что first меньше second.
 *   - сравнить, что first равна second.
 * 3. Загрузите код в github. Оставьте ссылку на коммит.
 * @author Sergei Begletsov
 * @since 22.04.2020
 * @version 1
 */

public class Liken {
    public static void main(String[] args) {
        int first = 10;
        int second = 9;

        boolean result = first > second; // first больше second?
        System.out.println(result);

        result = first < second; // first меньше second?
        System.out.println(result);

        result = first == second; // first равна second?
        System.out.println(result);
    }
}
