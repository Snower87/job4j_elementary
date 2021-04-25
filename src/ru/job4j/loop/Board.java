package ru.job4j.loop;

/**
 * @Раздел Блок 1. Базовый Синтаксис. / 4. Циклы.
 * @Задание 5.3. Построить шахматную доску в псевдографике. [13559#271466]
 * @Описание 1. Создайте класс ru.job4j.loop.Board
 * 2. В классе Board написать метод public static void paint(int width, int height), который должен рисовать
 *    шахматную доску из символов "x" и пробелов " " (в псевдографике).
 *    Входные параметры width - это ширина доски, height - это высота доски.
 * 3. В качестве аргумента в метод приходит положительное целое число n, сам метод должен
 *    возвращать рассчитанный факториал для этого числа.
 * 4. Протестируйте код в junit.
 * 5. Загрузите код в github. Оставьте ссылку на коммит.
 * @author Sergei Begletsov
 * @since 25.04.2020
 * @version 1
 */

public class Board {
    public static void paint(int width, int height) {
        System.out.println("Шахматная доска, " + width + " x " + height + ":");
        for (int row = 0; row < height; row++) {
            for (int cell = 0; cell < width; cell++) {
                if ((row + cell) % 2 == 0) {
                    //печатаем X
                    System.out.print("X");
                } else {
                    //печатаем "пусто"
                    System.out.print(" ");
                }
            }
            // добавляем перевод на новую строку.
            System.out.println();
        }
    }

    public static void main(String[] args) {
        paint(3, 3);
        System.out.println();
        paint(5, 4);
        System.out.println();
        paint(4, 4);
    }
}
