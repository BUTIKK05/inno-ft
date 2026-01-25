package by.alexeibut.ft.factory;

import by.alexeibut.ft.entity.CustomArray;

import java.util.List;

public class ArrayFactoryImpl implements ArrayFactory {

    @Override
    public CustomArray create(int[] elements) {
        return new CustomArray(elements);
    }

    public CustomArray fromStringList(List<String> values) {
        int[] array = new int[values.size()];
        for (int i = 0; i < values.size(); i++) {
            array[i] = Integer.parseInt(values.get(i));
        }
        return create(array);
    }
}