package ru.job4j.condition;

/**
 * @Раздел Блок 1. Базовый Синтаксис. / 3. Оператор ветвления.
 * @Задание 4.6.2. Switch - matcher. [#334071]
 * @Описание 1. Вам на вход поступает строка. Это название дня недели. Оно может быть как на английском, так и на русском.
 * Ваша задача - вернуть номер дня недели
 * 2. Загрузите файл на сайт github.com и оставьте ссылку на изменения.
 * @author Sergei Begletsov
 * @since 21.07.2020
 * @version 1
 */

public class MultipleSwitchWeek {
    public static int numberOfDay(String name) {
        return switch (name) {
            case "Понедельник", "Monday" -> 1;
            case "Вторник", "Tuesday" -> 2;
            case "Среда", "Wednesday" -> 3;
            case "Четверг", "Thursday" -> 4;
            case "Пятница", "Friday" -> 5;
            case "Суббота", "Saturday" -> 6;
            case "Воскресенье", "Sunday" -> 7;
            default -> -1;
        };
    }

    public static void main(String[] args) {
        System.out.println(numberOfDay("Понеде1ьник"));
        System.out.println(numberOfDay("Пятница"));
        System.out.println(numberOfDay("Monday"));
    }
}
