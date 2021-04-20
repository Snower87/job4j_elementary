package ru.job4j.calculator;

/**
 * @Раздел Блок 1. Базовый Синтаксис. / 1. Тип данных.
 * @Задание 6. Идеальный вес. [41584#271406]
 * @Описание 1. Доработайте методы manWeight и womanWeight.
 * Нужно дописать код, чтобы методы вычисляли идеальный вес для мужчины и женщины.
 * Формулы для вычисления идеального веса.
 *      Идеальный вес для мужчин = (рост в сантиметрах – 100) · 1,15.
 *      Идеальный вес для женщин = (рост в сантиметрах – 110) · 1,15.
 * Вместо -1 вам нужно написать формулу приведенную выше.
 * 2. Загрузите код в репозиторий. Оставьте ссылку на коммит.
 * @author Sergei Begletsov
 * @since 19.04.2020
 * @version 1
 */

public class Fit {
    public static double manWeight(short height) {
        double rsl = (height - 100) * 1.15;
        return rsl;
    }

    public static double womanWeight(short height) {
        double rsl = (height - 110) * 1.15;
        return rsl;
    }

    public static void main(String[] args) {
        short height100cm =  100;
        double man = Fit.manWeight(height100cm);
        System.out.println("1. Man 100 is " + man);

        double woman = Fit.womanWeight((short) (height100cm + 10));
        System.out.println("2. Woman 100 is " + woman);

        short height200cm =  200;
        short height220cm =  220;
        System.out.println("3. Man 200 is " + Fit.manWeight(height200cm));
        System.out.println("4. Woman 220 is " + Fit.womanWeight(height220cm));
    }
}
