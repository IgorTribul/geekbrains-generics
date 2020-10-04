package ru.geekbrains.generics.box;

import ru.geekbrains.generics.fruits.Apple;
import ru.geekbrains.generics.fruits.Fruit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class BoxWithFruits<F extends Fruit> {
    private List<F> fruits;

    public BoxWithFruits(List<F> fruits) {
        this.fruits = fruits;
    }

    public BoxWithFruits(F... fruits) {
        this.fruits = new ArrayList<F>(Arrays.asList(fruits));
    }

    public List<F> getFruits() {
        return fruits;
    }

    public void setFruits(F fruit) {
        this.fruits.add(fruit);
    }

    public int getBoxWeight() {
        int sum = 0;
        for (F fruit : fruits) {
            sum += fruit.getWeight();
        }
        return sum;
    }

    public boolean compare(BoxWithFruits<?> other) {
        return getBoxWeight() == other.getBoxWeight();
    }

}
