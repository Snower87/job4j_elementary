package ru.job4j.array;

import java.util.Arrays;

/**
 * @Раздел Блок 1. Базовый Синтаксис. / 5. Массивы.
 * @Задание 6.9. Жадный алгоритм. Сдача в кофе машине. [#34741]
 * @Описание 1. В этом задании нужно реализовать механизм возврата монет в лендинговых аппаратах.
 * У вас есть купюра 50, 100 рублей. Вы хотите купить кофе за 35 рублей. Если вы засунули 50 рублей, то автомат
 * должен вернуть 15 рублей (монетами 10 и 5). При этом метод должен вернуть результат в виде массива значений типа int,
 * т.е. для описанной ситуации в результате мы получим массив из двух чисел - {10, 5}. И монеты будут располагаться от
 * максимального к минимальному номиналу. Автомат может вернуть только монеты.
 * 2. Для решения этой задачи необходимо использовать жадный алгоритм.
 * Его смысл очень прост: Мы берем монету наибольшего номинала - 10. Далее вычитаем из суммы. Если остаток больше 0,
 * то операцию повторяем, а если меньше, то берем монету номиналом меньше. И так пока не дойдет до монеты в 1 рубль.
 * Ваше решение должно занимать 5-6 строчек кода. В нем нужно использовать цикл for - для прохода по монетам и
 * while - для проверки равенства.
 * 3. Протестируйте код в junit.
 * 4. Залейте код в репозиторий, оставьте ссылку на коммит.
 * @author Sergei Begletsov
 * @since 23.07.2021
 * @version 3
 */

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int size = 0;
        int cashBack = money - price;  //выдаваемая аппаратом сдача
        //Вариант 1 - первоначальный
        /*
        for (int indCoin = 0; indCoin < coins.length;) {
            while (cashBack > 0) {
                if (cashBack - coins[indCoin] >= 0) {
                    rsl[size++] = coins[indCoin];
                    cashBack -= coins[indCoin];
                } else {
                    indCoin++;
                }
            }
            break;
        }
        */
        //Вариант 1.1 - доработанный/упрощенный (без цикла for)
        /*
        int indCoin = 0;
        while (cashBack > 0) {
            if (cashBack - coins[indCoin] >= 0) {
                rsl[size++] = coins[indCoin];
                cashBack -= coins[indCoin];
            } else {
                indCoin++;
            }
        }
        */
        /*
        //Вариант 2 - окончательный
        for (int indCoin = 0; indCoin < coins.length; indCoin++) {
            while (cashBack - coins[indCoin] >= 0) {
                rsl[size++] = coins[indCoin];
                cashBack -= coins[indCoin];
            }
        }
        */
        //Вариант 2.1 - лаконичный доработанный (с циклом for-each)
        for (int coin: coins) {
            while (cashBack - coin >= 0) {
                rsl[size++] = coin;
                cashBack -= coin;
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}
