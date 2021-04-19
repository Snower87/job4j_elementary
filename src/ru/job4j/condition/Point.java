package ru.job4j.condition;

/**
 * @Раздел Блок 1. Базовый Синтаксис. / 1. Тип данных.
 * @Задание 7. Расстояние между точками в системе координат. [188#271418]
 * @Описание 1. Создайте класс ru.job4j.condition.Point. Допишите метод distance.
 * Используйте формулу, по которой можно вычислить расстояние между двумя точками в системе координат:
 * Dist = sqrt((x2 - x1)^2 + (y2 - y1)^2)
 * 2. Доработайте метод main. Нужно добавить в него вызов метода distance с различными аргументами.
 * 3. Загрузите код в репозиторий. Оставьте ссылку на коммит.
 * @author Sergei Begletsov
 * @since 19.04.2020
 * @version 1
 */

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        //Вариант 1:
        //1. Вычесть аргументы x2 и x1.
        int diff_x2_x1 = x2 - x1;
        //2. Вычесть аргументы y2 и y1.
        int diff_y2_y1 = y2 - y1;
        //3. Возвести в степень 2 результат операции 1.
        double pow_diff_x2_x1 = Math.pow(diff_x2_x1, 2);
        //4. Возвести в степень 2 результат операции 2.
        double pow_diff_y2_y1 = Math.pow(diff_y2_y1, 2);
        //5. Сложить результаты операций 3 и 4.
        double summ_pow_coord_x_and_y =  pow_diff_x2_x1 + pow_diff_y2_y1;
        //6. Вычислить корень квадратный из результата операции 5.
        double rsl = Math.sqrt(summ_pow_coord_x_and_y);

        //Вариант 2:
        //double rsl = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        return rsl;
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);

        result = Point.distance(3, 0, 0, 0);
        System.out.println("result (3, 0) to (0, 0) " + result);

        result = Point.distance(-3, 0, 0, 0);
        System.out.println("result (-3, 0) to (0, 0) " + result);

        result = Point.distance(0, 0, 2, 2);
        System.out.println("result (0, 0) to (2, 2) " + result);

        result = Point.distance(-2, -2, 2, 2);
        System.out.println("result (-2, -2) to (2, 2) " + result);
    }
}
