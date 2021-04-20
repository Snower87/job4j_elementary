package ru.job4j.condition;

/**
 * @Раздел Блок 1. Базовый Синтаксис. / 1. Тип данных.
 * @Задание 9.1. String. [237407#271416]
 * @Описание 1. Внутри метода main выполните следующие действия:
 * - создайте переменную с именем idea типа String и присвойте ей значение "I like Java!";
 * - выведите на консоль эту переменную через команду System.out.println(idea);
 * - присоедините к переменной idea строку "But I am a newbie.";
 * - создайте переменную year с типом int и присвойте ей текущий год.
 * - присоедините к переменной idea переменную year;
 * - выведите на консоль эту переменную через команду System.out.println(idea);
 * 2. Загрузите код в репозиторий. Оставьте ссылку на коммит.
 * @author Sergei Begletsov
 * @since 20.04.2020
 * @version 1
 */

public class Greeting {
    public static void main(String[] args) {
        String separate = " ";
        String idea = "I like Java!";
        System.out.println(idea);

        idea = idea + separate + "But I am a newbie.";
        System.out.println(idea);

        int year = 2021;
        idea += separate + year;
        System.out.println(idea);
    }
}
