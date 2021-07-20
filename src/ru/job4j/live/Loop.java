package ru.job4j.live;

/**
 * @Раздел Блок 1. Базовый Синтаксис. / 4. Циклы.
 * @Задание 5.9.1. Генерация конструкций в IDEA. [#279134]
 * @Описание 1. Создайте класс ru.job4j.live.Loop.
 * 2. Через шаблон psvm сгенерируйте метод main.
 * 3. Внутри метода main сгенерируйте цикл for через шаблон fori.
 *     Цикл должен выводить значения от 0 до 10.
 * 4. Внутри цикла сгенерируйте вывод на консоль через шаблон sout.
 * 5. Загрузите файл на сайт github.com и оставьте ссылку на изменения.
 * @author Sergei Begletsov
 * @since 20.07.2020
 * @version 1
 */

public class Loop {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }
    }
}
