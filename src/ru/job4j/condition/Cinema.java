package ru.job4j.condition;

/**
 * @Раздел Блок 1. Базовый Синтаксис. / 3. Оператор ветвления.
 * @Задание 4.2. Тернарное сравнение. [189#271374] (ver. 2)
 * @Описание 1. Допишите программу для кинотеатра, используя тернарный оператор
 * 2. Загрузите код в github. Оставьте ссылку на коммит.
 *
 * @Раздел Блок 1. Базовый Синтаксис. / 3. Оператор ветвления.
 * @Задание 4.1.1. Оператор if с блоком else. [227534#271370] (ver. 1)
 * @Описание 1. Разработайте программу для кинотеатра. В кинотеатре показывают фильмы для взрослых.
 * 2. Загрузите код в github. Оставьте ссылку на коммит.
 * @author Sergei Begletsov
 * @since 22.04.2020
 * @version 2
 */

public class Cinema {
    public static void access(int age) {
        System.out.println("The age of the customer is : " + age);
        boolean can = age >= 18;
        String label = can ? "Welcome to the cinema." : "It is not for you.";
        System.out.println(label);
    }

    public static void main(String[] args) {
        Cinema.access(21);
        Cinema.access(16);
    }
}
