package ru.geekbrains.generics.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.geekbrains.generics.box.BoxWithFruits;
import ru.geekbrains.generics.fruits.Orange;

import static org.junit.jupiter.api.Assertions.*;

class ShiftFruitTest {
    ShiftFruit<Orange> shiftFruits = new ShiftFruit<Orange>(
            new BoxWithFruits<Orange>(
                    new Orange(2),
                    new Orange(2),
                    new Orange(3),
                    new Orange(3)),
            new BoxWithFruits<Orange>(
                    new Orange(15)));

    @Test
    public void shiftBox() {
        System.out.println("Вес первой коробки до пересыпания фруктов: " + shiftFruits.firstBox.getBoxWeight());
        int beforeFirstBox = shiftFruits.firstBox.getBoxWeight();
        System.out.println("Вес второй коробки до пересыпания фруктов: " +shiftFruits.secondBox.getBoxWeight() + "\n");
        int beforeSecondBox = shiftFruits.secondBox.getBoxWeight();
        shiftFruits.shiftBox();
        System.out.println("Вес первой коробки после пересыпания фруктов: " + shiftFruits.firstBox.getBoxWeight());
        int afterFirstBox = shiftFruits.firstBox.getBoxWeight();
        System.out.println("Вес второй коробки после пересыпания фруктов: " +shiftFruits.secondBox.getBoxWeight() + "\n");
        int afterSecondBox = shiftFruits.secondBox.getBoxWeight();
        int sum = beforeFirstBox + beforeSecondBox;

        Assertions.assertTrue(afterFirstBox == 0 & afterSecondBox == sum) ;
    }
}