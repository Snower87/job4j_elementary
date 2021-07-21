package ru.job4j.condition;

/**
 * @Раздел Блок 1. Базовый Синтаксис. / 3. Оператор ветвления.
 * @Задание 4.3.2. Оператор ||. [#333784]
 * @Описание 1. Ниже приведен код класса Club. Метод permission выводит на консоль, можем мы пройти в клуб или нет.
 * Правила пропуска: или у посетителя есть деньги, или посетитель - наш друг.
 * 2. Допишите метод по условию задачи.
 * 3. Загрузите файл на сайт github.com и оставьте ссылку на изменения.
 * @author Sergei Begletsov
 * @since 21.07.2020
 * @version 1
 */

public class Club {
    public static void permission(boolean hasMoney, boolean beFriend) {
        if (hasMoney || beFriend) {
            System.out.println("I can go to the club.");
        } else {
            System.out.println("I can't.");
        }
    }

    public static void main(String[] args) {
        permission(true, true);
        permission(true, false);
        permission(false, true);
        permission(false, false);
    }
}
