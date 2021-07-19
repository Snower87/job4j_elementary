package ru.job4j.calculator;

/**
 * @Раздел Блок 1. Базовый Синтаксис. / 1. Тип данных.
 * @Задание 4.1. Аргументы. [#295521]
 * @Описание 1. Ниже приведен код с ошибками. Ваша задача поправить код, чтобы он компилировался.
 * Метод hello принимает два аргумента: первый аргумент имеет тип String, второй аргумент имеет тип int.
 * В методе main мы вызывает 4 раза метод hello. Вам нужно написать правильные аргументы.
 * 2. Загрузите файл на сайт github.com и оставьте ссылку на изменения.
 * @author Sergei Begletsov
 * @since 19.07.2021
 * @version 1
 */

public class ArgMethod {
    public static void hello(String name, int age) {
        System.out.println("Hello, " + name + ", age = " + age);
    }

    public static void main(String[] args) {
        String name = "Petr Arsentev";
        int age = 33;
        ArgMethod.hello(name, age);
        ArgMethod.hello(name, age);
        ArgMethod.hello(name, age);
        ArgMethod.hello(name, age);
    }
}
