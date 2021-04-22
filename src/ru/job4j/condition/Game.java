package ru.job4j.condition;

/**
 * @Раздел Блок 1. Базовый Синтаксис. / 3. Оператор ветвления.
 * @Задание 4.1.0. Операторы сравнения в String. [237406#271372]
 * @Описание 1. Создайте класс ru.job4j.condition.Game.
 * Метод menu принимает String name - это название игры.
 * В блоке if мы находим подходящую игру и выводим на консоль приветствие.
 * 2. Загрузите код в github. Оставьте ссылку на коммит.
 * @author Sergei Begletsov
 * @since 22.04.2020
 * @version 1
 */

public class Game {
    public static void menu(String name) {
        if (name.equals("super mario")) { /* сравниваем переменную name с "super mario" */
            System.out.println("Start - super mario");
        }
        if (name.equals("tanks")) { /* Сравнить переменную name с "tanks" */
            System.out.println("Start - tanks");
        }
        if (name.equals("tetris")) { /* Сравнить переменную name с "tetris" */
            System.out.println("Start - tetris");
        }
    }

    public static void main(String[] args) {
        Game.menu("tanks");
    }
}
