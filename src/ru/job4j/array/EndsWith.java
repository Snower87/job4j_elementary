package ru.job4j.array;

/**
 * @Раздел Блок 1. Базовый Синтаксис. / 5. Массивы.
 * @Задание 6.4.1. Слово заканчивается на ... [156317#271386]
 * @Описание 1. Необходимо создать класс ru.job4j.array.EndsWith,
 *  реализовать метод public static boolean endsWith(char[] word, char[] post).
 * 2. Метод проверяет то, что слово заканчивается на определенную последовательность.
 * Например:
 *      Привет - вет > true
 *      Привет - вит > false.
 * 3. Добавьте 2 теста. Протестируйте код в junit.
 * 4. Залейте код в git-репозиторий, оставьте ссылку на коммит.
 * @author Sergei Begletsov
 * @since 01.05.2020
 * @version 1
 */

public class EndsWith {
    /**
     * Проверяет есть ли в конце строки подстрока
     * @param word указатель/ссылка на сравниваемое слово (строка)
     * @param post указатель/ссылка на префикс (подстроку)
     * @return true - если в строке содержится подстрока, false - если нет
     */
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
        int positionSubStr = word.length - post.length;
        // проверить. что массив word имеет последние элементы одинаковые с post
        for (int index = 0; index < post.length; index++) {
            if (post[index] != word[index + positionSubStr]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
