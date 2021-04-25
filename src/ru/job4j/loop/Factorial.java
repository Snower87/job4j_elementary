package ru.job4j.loop;

/**
 * @Раздел Блок 1. Базовый Синтаксис. / 4. Циклы.
 * @Задание 5.2. Создать программу, вычисляющую факториал. [193#271463]
 * @Описание 1. Создайте класс ru.job4j.loop.Factorial
 * 2. В классе Factorial напишите метод public static int calc(int n) {}.
 * 3. В качестве аргумента в метод приходит положительное целое число n, сам метод должен
 *    возвращать рассчитанный факториал для этого числа.
 * 4. Протестируйте код в junit.
 * 5. Загрузите код в github. Оставьте ссылку на коммит.
 * @author Sergei Begletsov
 * @since 25.04.2020
 * @version 1
 */

public class Factorial {
    public static int calc(int n) {
        //Считаем факториал для n >= 2
        if (n >= 2) {
            //факторал считаем, если n не равно 0
            int result = 1;

            for (int i = 1; i <= n; i++) {
                result *= i;
            }
            return result;
        }
        //Факториал 0 равен 1
        //Факториал 1 равен 1
        return 1;
    }
}
