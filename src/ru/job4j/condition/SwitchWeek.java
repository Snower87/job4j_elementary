package ru.job4j.condition;

/**
 * @Раздел Блок 1. Базовый Синтаксис. / 3. Оператор ветвления.
 * @Задание 4.6.1. Switch. [#334070]
 * @Описание 1. Задан каркас класса. Ваша задача найти день недели в зависимости от его порядкового номера.
 * Например, для 1 это "Понедельник", для 7 "Воскресенье". Если номер не входит в диапазон [1, 7] нужно вернуть "Ошибка"
 * 2. Загрузите файл на сайт github.com и оставьте ссылку на изменения.
 * @author Sergei Begletsov
 * @since 21.07.2020
 * @version 1
 */

public class SwitchWeek {
    public static String nameOfDay(int day) {
        String name;
        switch (day) {
            case 1:
                name = "Понедельник";
                break;
            case 2:
                name = "Вторник";
                break;
            case 3:
                name = "Среда";
                break;
            case 4:
                name = "Четверг";
                break;
            case 5:
                name = "Пятница";
                break;
            case 6:
                name = "Суббота";
                break;
            case 7:
                name = "Воскресенье";
                break;
            default:
                name = "Ошибка";
                break;
        }
        return name;
    }

    public static void main(String[] args) {
        System.out.println(SwitchWeek.nameOfDay(1));
        System.out.println(SwitchWeek.nameOfDay(7));
        System.out.println(SwitchWeek.nameOfDay(0));
    }
}
