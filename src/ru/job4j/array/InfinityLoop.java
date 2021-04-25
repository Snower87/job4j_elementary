package ru.job4j.array;

/**
 * @Раздел Блок 1. Базовый Синтаксис. / 4. Циклы.
 * @Задание 5.0.2. Вечный цикл for. [226417#271461]
 * @Описание 1. Создайте класс ru.job4j.array.InfinityLoop (см. описание)
 * 2. Ответьте на вопрос: Какой оператор вызывает вечный цикл?
 * 3. Загрузите код в github. Оставьте ссылку на коммит.
 * @author Sergei Begletsov
 * @since 25.04.2020
 * @version 1
 */

public class InfinityLoop {
    public static void main(String[] args) {
        for (int index = 0; index < 10; index++) {
            System.out.println("infinity");
            //index = index - 1;
        }
    }
}
