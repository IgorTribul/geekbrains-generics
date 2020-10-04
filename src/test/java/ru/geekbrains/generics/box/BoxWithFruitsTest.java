package ru.geekbrains.generics.box;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.geekbrains.generics.fruits.Apple;

import static org.junit.jupiter.api.Assertions.*;

class BoxWithFruitsTest {

    BoxWithFruits<Apple> boxAppleOne = new BoxWithFruits<Apple>(
            new Apple(2),
            new Apple(3),
            new Apple(5));
    BoxWithFruits<Apple> boxAppleTwo = new BoxWithFruits<Apple>(
            new Apple(5),
            new Apple(5));
    BoxWithFruits<Apple> boxAppleThree = new BoxWithFruits<Apple>(
            new Apple(2),
            new Apple(2),
            new Apple(2),
            new Apple(2));


    @Test
    public void positiveGetBoxWeight() {
        int sum = boxAppleOne.getBoxWeight();
        Assertions.assertEquals(10, sum);
    }
    @Test
    public void negativeGetBoxWeight() {
        int sum = boxAppleOne.getBoxWeight();
        Assertions.assertNotEquals(12, sum);
    }
    @Test
    public void positiveCompare() {
        Assertions.assertTrue(boxAppleOne.compare(boxAppleTwo));
    }
    @Test
    public void negativeCompare() {
        Assertions.assertFalse(boxAppleOne.compare(boxAppleThree));
    }
}