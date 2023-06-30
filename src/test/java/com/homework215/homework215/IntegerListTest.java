package com.homework215.homework215;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class IntegerListTest {


    ArrayList test = new ArrayList(3);
    ArrayList test1 = new ArrayList(3);
    ArrayList test2 = new ArrayList(2);



    @Test
    public void ShouldCorrectlyAdd() {
        Integer expected = 1;
        Integer actual = test.add(1);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ShouldCorrectlyAddWithIndex() {
        Integer expected = 1;
        Integer actual = test.add(1,1);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ShouldCorrectlyThrowErrorWhenAddingWithIndex() {
        Assertions.assertThrows(ArrayIndexOutOfBoundsException.class, () ->
        {
            Integer actual = test.add(4,1);
        });
    }

    @Test
    public void ShouldCorrectlySet() {
        Integer expected = 1;
        Integer actual = test.set(1, 1);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ShouldCorrectlyRemoveByItem() {
        test.add(1);
        Integer expected = 1;
        Integer actual = test.remove(1);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ShouldCorrectlyThrowErrorWhenRemovingByItem() {
        test.add(1);
        Assertions.assertThrows(ItemDoesntExist.class, () ->
        {
            Integer actual = test.remove(2);
        });
    }

    @Test
    public void ShouldCorrectlyThrowErrorWhenRemovingByIndex() {
        test.add(1);
        Assertions.assertThrows(ArrayIndexOutOfBoundsException.class, () ->
        {
            Integer actual = test.remove(4);
        });
    }

    @Test
    public void ShouldCorrectlyRemoveByIndex() {
        test.add(1);
        Integer expected = 1;
        Integer actual = test.remove(1);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ShouldCorrectlyDisplayContained() {
        test.add(1);
        boolean expected = true;
        boolean actual = test.contains(Integer.valueOf(1));
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ShouldCorrectlyDisplayIndexFromStart() {
        test.add(1);
        test.add(2);
        test.add(3);
        int expected = 2;
        int actual = test.indexOf(2);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ShouldCorrectlyThrowErrorWhenDisplayingIndexFromStart() {
        test.add(1);
        test.add(2);
        test.add(3);
        Assertions.assertThrows(ItemDoesntExist.class, () ->
        {
            int actual = test.indexOf(4);
        });
    }

    @Test
    public void ShouldCorrectlyDisplayIndexFromEnd() {
        test.add(1);
        test.add(2);
        test.add(3);
        int expected = 2;
        int actual = test.lastIndexOf(2);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ShouldCorrectlyThrowErrorWhenDisplayingIndexFromEnd() {
        test.add(1);
        test.add(2);
        test.add(3);
        Assertions.assertThrows(ItemDoesntExist.class, () ->
        {
            int actual = test.lastIndexOf(4);
        });
    }

    @Test
    public void ShouldCorrectlyDisplayItemWhenGettingByIndex() {
        test.add(1);
        test.add(2);
        test.add(3);
        Integer expected = 2;
        Integer actual = test.get(2);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ShouldCorrectlyThrowErrorWhenGettingByIndex() {
        test.add(1);
        test.add(2);
        test.add(3);
        Assertions.assertThrows(ArrayIndexOutOfBoundsException.class, () ->
        {
            Integer actual = test.get(4);
        });
    }

    @Test
    public void ShouldCorrectlyDisplayTrueWhenCheckingEquals() {
        test.add(1);
        test.add(2);
        test.add(3);
        test1.add(1);
        test1.add(2);
        test1.add(3);
        boolean expected = true;
        boolean actual = test.equals(test1);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ShouldCorrectlyDisplayFalseWhenCheckingEquals() {
        test.add(1);
        test.add(2);
        test.add(3);
        test1.add(1);
        test1.add(2);
        test1.add(4);
        boolean expected = false;
        boolean actual = test.equals(test1);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ShouldCorrectlyDisplayFalseWhenCheckingEqualsWithDiffSizes() {
        test.add(1);
        test.add(2);
        test.add(3);
        test2.add(1);
        test2.add(2);
        boolean expected = false;
        boolean actual = test.equals(test1);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ShouldCorrectlyDisplaySize() {
        int expected = 3;
        int actual = test.size();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ShouldCorrectlyDisplayTrueWhenCheckingIsEmpty() {
        boolean expected = true;
        boolean actual = test.isEmpty();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ShouldCorrectlyDisplayFalseWhenCheckingIsEmpty() {
        test.add(1);
        boolean expected = false;
        boolean actual = test.isEmpty();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ShouldCorrevoidClearArray() {
        test.add(1);
        test.add(2);
        test.add(3);
        String [] expected = {null, null, null};
        test.clear();
        Integer [] actual = test.toArray();
    }

    @Test
    public void ShouldCorrectlyTransformToArray() {
        test.add(1);
        test.add(2);
        test.add(3);
        Integer [] expected = {1,2,3};
        Integer [] actual = test.toArray();
    }
}