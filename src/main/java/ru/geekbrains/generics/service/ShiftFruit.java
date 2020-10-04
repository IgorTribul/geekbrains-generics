package ru.geekbrains.generics.service;

import ru.geekbrains.generics.box.BoxWithFruits;
import ru.geekbrains.generics.fruits.Apple;
import ru.geekbrains.generics.fruits.Fruit;
import ru.geekbrains.generics.fruits.Orange;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ShiftFruit<F extends Fruit> {
    BoxWithFruits<F> firstBox;
    BoxWithFruits<F> secondBox;

    public ShiftFruit(BoxWithFruits<F> firstBox, BoxWithFruits<F> secondBox) {
        this.firstBox = firstBox;
        this.secondBox = secondBox;
    }

    public void shiftBox() {
        List<F> fruitsBefore = firstBox.getFruits();
        List<F> fruitsAfter = secondBox.getFruits();
        Iterator<F> boxIterator = fruitsBefore.iterator();
            while (boxIterator.hasNext()) {
                secondBox.setFruits(boxIterator.next());
                boxIterator.remove();
            }
        }
    }


