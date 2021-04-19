package ru.job4j.condition;

/**
 * @Раздел Блок 1. Базовый Синтаксис. / 1. Тип данных.
 * @Задание 9. Площадь треугольника. [175474#271412]
 * @Описание 1. Создайте класс ru.job4j.condition.TrgArea.
 * 2. Реализуйте метод area (вычисление площади) по формуле Герона:
 *      S = sqrt(p * (p - a) * (p - b) * (p - c)), где p - полупериметр
 * 3. Загрузите код в репозиторий. Оставьте ссылку на коммит.
 * @author Sergei Begletsov
 * @since 19.04.2020
 * @version 1
 */

public class TrgArea {
    public static double area(double a, double b, double c) {
        double p = (a + b + c) / 2; //полупириметр
        double rsl = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return rsl;
    }

    public static void main(String[] args) {
        double rsl = TrgArea.area(2, 2, 2);
        System.out.println("area (2, 2, 2) = " + rsl);

        double rs2 = TrgArea.area(3, 3, 3);
        System.out.println("area (3, 3, 3) = " + rs2);
    }
}