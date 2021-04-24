package ru.job4j.condition;

/**
 * @Раздел Блок 1. Базовый Синтаксис. / 3. Оператор ветвления.
 * @Задание 4.5. Отладка программы в IDEA. [159464#271369]
 * @Описание 1. Создайте класс ru.job4j.condition.ThreeMax. (см. описание)
 * 2. В методе public static int max(int first, int second, int third) с помощью отладки найдите ошибки и устраните их.
 * 3. Проверьте результат тестами.
 * 4. Загрузите код в github. Оставьте ссылку на коммит.
 * @author Sergei Begletsov
 * @since 24.04.2020
 * @version 1
 */

public class ThreeMax {
    public static int max(int first, int second, int third) {
        int result = third;
        if (first >= second && first >= third) {
            result = first;
        }
        if (second > first && second >= third) {
            result = second;
        }
        return result;
    }
}
