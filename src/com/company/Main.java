package com.company;

import java.util.Arrays;

public class Main {
     /* Подсчитать и вывести сумму чека по 4 позициям:
        Зеленое яблоко 186г / 25.90
        Красное яблоко 146г / 26.90
        Банан 186г / 32.80
        Лимон 246г / 34.90 */

    public static void main(String[] args) {
        Fruit greenApple = new Fruit(Fruit.Type.APPLE,Color.GREEN, 186, 25.90 );
        Fruit redApple = new Fruit(Fruit.Type.APPLE, Color.RED, 146, 26.90);
        Fruit yellowBanana = new Fruit(Fruit.Type.BANANA, Color.YELLOW, 186, 32.80);
        Fruit yellowLemon = new Fruit(Fruit.Type.LEMON, Color.YELLOW, 246, 34.90);

        Fruit[] fruits = new Fruit[4];
        fruits[0] = greenApple;
        fruits[1] = redApple;
        fruits[2] = yellowBanana;
        fruits[3] = yellowLemon;

        System.out.println(Arrays.toString(fruits));

        Calculate calculate = new Calculate();

        System.out.println("Check amuont: " + calculate.getTotalPrice(fruits));
    }
}
