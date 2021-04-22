package ru.job4j.condition;

/**
 * @Раздел Блок 1. Базовый Синтаксис. / 3. Оператор ветвления.
 * @Задание 4.1.2. Глупый бот. [31323#271366]
 * @Описание 1. Доработайте класс condition.DummyBot. Выполните задание:
 * Бот должен принимать строку и возвращать ответ.
 * Бот наш глупый. Он знает только три фразы.
 * Если пришла фраза "Привет, Бот.", бот отвечает: "Привет, умник."
 * Если пришла фраза "Пока.", бот отвечает: "До скорой встречи."
 * Если пришла любая другая фраза,  бот отвечает: "Это ставит меня в тупик. Задайте другой вопрос."
 * Помните, что строки можно сравнивать только через методы equals. Нельзя использовать ==.
 * 2. Загрузите код в github. Оставьте ссылку на коммит.
 * @author Sergei Begletsov
 * @since 22.04.2020
 * @version 1
 */

public class DummyBot {
    public static String answer(String question) {
        String rsl = "Это ставит меня в тупик. Задайте другой вопрос.";
        if ("Привет, Бот.".equals(question)) {
            rsl = "Привет, умник.";
        } else if ("Пока.".equals(question)) {
            rsl = "До скорой встречи.";
        }
        return rsl;
    }

    public static void main(String[] args) {
        String rsl = DummyBot.answer("Привет, Бот.");
        System.out.println(rsl);
        rsl = DummyBot.answer("Пока.");
        System.out.println(rsl);
        rsl = DummyBot.answer("ППППривет");
        System.out.println(rsl);
    }
}
