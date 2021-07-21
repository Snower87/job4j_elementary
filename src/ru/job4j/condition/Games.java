package ru.job4j.condition;

/**
 * @Раздел Блок 1. Базовый Синтаксис. / 3. Оператор ветвления.
 * @Задание 4.3.1. Оператор &&. [#333783]
 * @Описание 1. Ниже приведен каркас класса Games. Метод permission должен вывести на консоль решение о посещении
 * игрового клуба. Метод permission имеет два параметра:
 *  allowByParent - разрешение от родителей, hasMoney - есть ли у клиента деньги.
 * 2. Допишите метод permission так, что если обе переменные -"истина", то мы можем пойти в игровой клуб.
 * 3. Загрузите файл на сайт github.com и оставьте ссылку на изменения.
 * @author Sergei Begletsov
 * @since 21.07.2020
 * @version 1
 */

public class Games {
    public static void permission(boolean allowByParent, boolean hasMoney) {
        if (allowByParent &&  hasMoney) {
            System.out.println("I can go to the cinema.");
        } else {
            System.out.println("I can't.");
        }
    }

    public static void main(String[] args) {
        Games.permission(true, true);
        Games.permission(true, false);
        Games.permission(false, true);
        Games.permission(false, false);
    }
}
