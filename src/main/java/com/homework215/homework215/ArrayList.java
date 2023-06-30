package com.homework215.homework215;

public class ArrayList{


    private Integer[] integerArray;

    public ArrayList(int size) {
        this.integerArray = new Integer[size];
        for (int i = 0; i < size; i++) {
            integerArray[i] = 0;
        }
    }

    public Integer add(Integer item) {
        boolean isFull = true;

        for (int i = 0; i < integerArray.length; i++) {
            if (integerArray[i].equals(0)) {
                isFull = false;
            }
        }

        if(isFull == true) {
            throw new ArrayIndexOutOfBoundsException("Массив заполнен.");
        }

        for (int i = 0; i < integerArray.length; i++) {
            if(integerArray[i].equals(0)) {
                integerArray[i] = item;
                break;
            }
        }

        return item;
    }


    public Integer add(int index, Integer item) {

        if (index > integerArray.length) {
            throw new ArrayIndexOutOfBoundsException("Номер элемента превышает размер массива.");
        }

        for (int i = integerArray.length - 1; i > index - 1; i--) {
            integerArray[i] = integerArray[i - 1];
        }

        integerArray[index - 1] = item;

        return item;
    }

    public Integer set(int index, Integer item) {

        if (index > integerArray.length) {
            throw new ArrayIndexOutOfBoundsException("Номер элемента превышает размер массива.");
        }

        integerArray[index - 1] = item;

        return item;
    }

    public Integer remove(Integer item) {

        if(!this.contains(item)) {
            throw new ItemDoesntExist("Элемент отсутствует");
        }

        int num = -1;
        for (int i = 0; i < integerArray.length; i++) {
            if (integerArray[i].equals(item)) {
                num = i + 1;
            }
        }
        for (int i = num - 1; i < integerArray.length - 1; i++) {
            integerArray[i] = integerArray[i + 1];
        }
        integerArray[integerArray.length - 1] = 0;

        return item;
    }
    public Integer remove(int index) {

        if (index > integerArray.length) {
            throw new ArrayIndexOutOfBoundsException("Номер элемента превышает размер массива.");
        }

        Integer item = integerArray[index - 1];
        for (int i = index - 1; i < integerArray.length - 1; i++) {
            integerArray[i] = integerArray[i + 1];
        }

        integerArray[integerArray.length - 1] = 0;

        return item;
    }

    public boolean contains(Integer item) {
        boolean isPresent = false;
        for (int i = 0; i < integerArray.length; i++) {
            if (integerArray[i].equals(item)) {
                isPresent = true;
            }
        }
        return isPresent;
    }

    public int indexOf(Integer item) {

        if(!this.contains(item)) {
            throw new ItemDoesntExist("Элемент отсутствует");
        }

        int number = -1;
        for (int i = 0; i < integerArray.length; i++) {
            if (integerArray[i].equals(item)) {
                number = i + 1;
            }
        }
        return number;
    }

    public int lastIndexOf(Integer item) {

        if(!this.contains(item)) {
            throw new ItemDoesntExist("Элемент отсутствует");
        }

        int number = -1;
        for (int i = integerArray.length - 1; i > 0; i--) {
            if (integerArray[i].equals(item)) {
                number = i + 1;
            }
        }
        return number;
    }

    public Integer get(int index) {

        if (index > integerArray.length) {
            throw new ArrayIndexOutOfBoundsException("Номер элемента превышает размер массива.");
        }

        Integer item = integerArray[index - 1];

        return item;
    }

    public boolean equals(ArrayList otherList) {
        boolean isEqual = true;
        if(this.integerArray.length != otherList.integerArray.length) {
            isEqual = false;
        }
        for (int i = 0; i < this.integerArray.length; i++) {
            if(!this.integerArray[i].equals(otherList.integerArray[i])) {
                isEqual = false;
            }
        }
        return isEqual;
    }

    public int size() {
        return integerArray.length;
    }

    public boolean isEmpty() {
        boolean isEmpty = true;
        for (int i = 0; i < integerArray.length; i++) {
            if(!integerArray[i].equals(0)) {
                isEmpty = false;
            }
        }
        return isEmpty;
    }

    public void clear() {
        for (int i = 0; i < integerArray.length; i++) {
            integerArray[i] = 0;
        }
    }


    public Integer[] toArray() {
        Integer [] array = new Integer[this.size()];
        for (int i = 0; i < array.length; i++) {
            array[i] = integerArray[i];
        }

        return array;
    }
}
