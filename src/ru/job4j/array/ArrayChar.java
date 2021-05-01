package ru.job4j.array;

/**
 * @Раздел Блок 1. Базовый Синтаксис. / 5. Массивы.
 * @Задание 6.4. Слово начинается с ... [41585#271382]
 * @Описание 1. Необходимо создать класс ru.job4j.array.ArrayChar,
 *  а также реализовать метод public static boolean startsWith(char[] word, char[] pref).
 * 2. Метод проверяет, что слово начинается c определенной последовательности.
 * Например.
 *      Привет - При - true
 *      Привет - Пре - false.
 * 3. В классе CheckTest напишите 2 тест-метода, которые будут проверять вашу программу для случая, кода все элементы
 *    массива одинаковые и для случая, когда в массиве есть различающиеся элементы. Протестируйте код в junit.
 * 4. Залейте код в git-репозиторий, оставьте ссылку на коммит.
 * @author Sergei Begletsov
 * @since 01.05.2020
 * @version 1
 */

public class ArrayChar {
    /**
     * Проверяет есть ли в строке подстрока
     * @param word указатель/ссылка на сравниваемое слово (строка)
     * @param pref указатель/ссылка на префикс (подстроку)
     * @return true - если в строке содержится подстрока, false - если нет
     */
    public static boolean startsWith(char[] word, char[] pref) {
        boolean result = true;
        for (int index = 0; index < pref.length; index++) {
            if (pref[index] != word[index]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
