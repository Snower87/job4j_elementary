package ru.job4j.condition;

/**
 * @Раздел Блок 1. Базовый Синтаксис. / 3. Оператор ветвления.
 * @Задание 4.1. Операторы ветвлений. [3611#271376]
 * @Описание 1. Создайте класс ru.job4j.AlertDivByZero (код в описании к задаче)
 * 2. Доработайте метод possibleDiv так, чтобы на консоль выводило строчку "This is negative numbers",
 * если число number меньше чем 0.
 * 3. Загрузите код в github. Оставьте ссылку на коммит.
 * @author Sergei Begletsov
 * @since 22.04.2020
 * @version 1
 */

public class AlertDivByZero {
    public static void main(String[] args) {
        possibleDiv(4);
        possibleDiv(0);
        possibleDiv(-1);
    }

    public static void possibleDiv(int number) {
        if (number == 0) {
            System.out.println("Could not div by 0.");
        }

        if (number < 0) {
            System.out.printf("This is negative numbers");
        }
    }
}