package ru.job4j.array;

/**
 * @Раздел Блок 1. Базовый Синтаксис. / 5. Массивы.
 * @Задание 6.6.1. Двухмерный массив. Вывод на консоль. [226796#271400]
 * @Описание 1. Необходимо создать класс ru.job4j.array.Sequence. Внутри метода main() объявите двойной массив
 * типа int 3 на 3 и заполните его цифрами 1-9.
 * 2. Залейте код в git-репозиторий, оставьте ссылку на коммит.
 * @author Sergei Begletsov
 * @since 02.05.2020
 * @version 1
 */

public class Sequence {
    public static void main(String[] args) {
        int[][] table = new int[3][3];
        int numb = 1;

        //1. Заполняю цифрами от 1 до 9
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                table[i][j] = numb++;
            }
        }

        //2. Вывожу на экран для проверки
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf(table[i][j] + " ");
            }
            System.out.println();
        }
    }
}
