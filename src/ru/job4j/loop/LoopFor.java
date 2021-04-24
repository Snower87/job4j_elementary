package ru.job4j.loop;

/**
 * @Раздел Блок 1. Базовый Синтаксис. / 4. Циклы.
 * @Задание 5.0. Цикл for. Определение. [3572#271464]
 * @Описание 1. Создайте класс ru.job4j.loop.LoopFor (см. описание)
 * 2. Доработайте метод main() для вывода на консоль чисел от 5 до 10.
 * 3. Загрузите код в github. Оставьте ссылку на коммит.
 * @author Sergei Begletsov
 * @since 24.04.2020
 * @version 1
 */

public class LoopFor {
    public static void main(String[] args) {
        for (int index = 5; index <= 10; index++) {
            System.out.println(index);
        }
    }
}
