package ru.job4j.condition;

/**
 * @Раздел Блок 1. Базовый Синтаксис. / 3. Оператор ветвления.
 * @Задание 4.2. Тернарное сравнение. [189#271374]
 * @Описание 1. Создайте класс ru.job4j.condition.Max.
 * 2. Реализуйте метод max(), который должен возвращать максимальное число из left и right.
 * То есть в конце метода должно быть ключевое слово return, которое возвращает вычисленное значение.
 *      Пример метода сложения двух чисел:
 * public static int summation(int first, int second) {
 *   int result = first + second;
 *   return result;
 * }
 * 3. Для решения этой задачи надо использовать тернарное условие!
 * 4. Добавьте тест ru.job4j.condition.MaxTest.
 * 5. Загрузите код в github. Оставьте ссылку на коммит.
 * @author Sergei Begletsov
 * @since 23.04.2020
 * @version 1
 */

public class Max {
    public static int max(int left, int right) {
        int result = left > right ? left : right;
        return result;
    }
}
