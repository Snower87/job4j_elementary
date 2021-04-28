package ru.job4j.loop;

/**
 * @Раздел Блок 1. Базовый Синтаксис. / 4. Циклы.
 * @Задание 5.9. Крест в псевдографике. [177182#271459]
 * @Описание 1. Создайте класс ru.job4j.loop.Slash
 * 2. В классе Slash реализуйте метод public static void draw(int size), который будет рисовать крест в консоли.
 * 3. Для решения этой задачи вам нужно составить таблицу с индексами (по аналогии с задачей "Шахматная доска").
 * Выражения для вычисления left и right будут отличаться.
 * Для вычисления left нужно использовать индексы row и cell.
 * Для вычисления right нужно использовать индексы row, cell и размер поля size. Помните, что мы начинаем считать с 0. Это нужно учитывать при вычислении переменной right.
 * Также помните, что диагональ есть только в квадрате с нечетным размером. Это условие проверять не надо.
 * 4. Протестируйте код в junit.
 * 5. Загрузите код в github. Оставьте ссылку на коммит.
 * @author Sergei Begletsov
 * @since 28.04.2020
 * @version 1
 */

public class Slash {
    /**
     * Метод рисует крест (Х) на консоли
     * @param size размер креста (Х)
     */
    public static void draw(int size) {
        for (int row = 0; row < size; row++) {
            for (int cell = 0; cell < size; cell++) {
                boolean left = row == cell; // добавить условие, по которому нужно определить ставить ли символ или нет.
                boolean right = cell + row == size - 1; // добавить условие, что нужно ставить элемент в правый угол.
                if (left) {
                    System.out.print("0");
                } else if (right) {
                    System.out.print("0");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("Draw by 3");
        draw(3);
        System.out.println("Draw by 5");
        draw(5);
    }
}
