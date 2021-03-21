package com.company;

public class Calculate {
    public double calculatePrice(double price, double weight) {
        return price * weight / 1000;
    }
    public double getTotalPrice(Fruit[] fruits) {
        double sum = 0;
        for(Fruit fruit : fruits) {
           sum += calculatePrice(fruit.getPrice(), fruit.getWeight());
        }
        return sum;
    }
}
