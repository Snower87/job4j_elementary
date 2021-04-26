package ru.job4j.loop;

/**
 * @Раздел Блок 1. Базовый Синтаксис. / 4. Циклы.
 * @Задание 5.5. Простое число. [171694#271458]
 * @Описание 1. Создайте класс ru.job4j.loop.SeqNumber
 * 2. Напишем программу с использование оператора break. Программа будет выводить на консоль числа, сумма которых равны заданному числу.
 *    Например, задано число 6. Его можно получить, сложив 1, 2, 3.
 *    Если последовательное сложение не дает нужного числа, то выйти.
 *    Обратите внимание: мы не считаем до конца условия (index <= n).
 *    Мы делаем прерывание. Этим мы экономим ресурсы и увеличиваем скорость вычисления.
 * 3. Загрузите код в github. Оставьте ссылку на коммит.
 * @author Sergei Begletsov
 * @since 26.04.2020
 * @version 1
 */

public class SeqNumber {
    public static void main(String[] args) {
        calc(6);
        calc(5);
    }

    public static void calc(int n) {
        int hold = 0;
        for (int index = 1; index <= n; index++) {
            hold += index;
            if (hold == n) {
                System.out.println("Success");
                break;
            } else if (hold > n) {
                System.out.println("Not possible");
                break;
            }
            System.out.println(hold);
        }
    }
}
