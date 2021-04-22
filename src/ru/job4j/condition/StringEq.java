package ru.job4j.condition;

/**
 * @Раздел Блок 1. Базовый Синтаксис. / 3. Оператор ветвления.
 * @Задание 4.1.0. Операторы сравнения в String. [237406#271372]
 * @Описание 1. Создайте класс ru.job4j.condition.StringEq (код из описания к задаче)
 * 2. Загрузите код в github. Оставьте ссылку на коммит.
 * @author Sergei Begletsov
 * @since 22.04.2020
 * @version 1
 */

public class StringEq {
    public static boolean check(String login) {
        String root = "root";
        boolean access = login.equals(root);
        return access;
    }

    public static void main(String[] args) {
        String your = "your_name";
        boolean userHasAccess = StringEq.check(your);
        System.out.println("name: " + your + ", " + userHasAccess);

        your = "root2";
        userHasAccess = StringEq.check(your);
        System.out.println("name: " + your + ", " + userHasAccess);

        your = "root";
        userHasAccess = StringEq.check(your);
        System.out.println("name: " + your + ", " + userHasAccess);
    }
}
