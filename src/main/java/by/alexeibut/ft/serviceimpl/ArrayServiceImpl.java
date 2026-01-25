package by.alexeibut.ft.serviceimpl;

import by.alexeibut.ft.entity.CustomArray;
import by.alexeibut.ft.service.ArrayService;

public class ArrayServiceImpl implements ArrayService {

    @Override
    public int findMin(CustomArray array) {
        int min = array.getElements()[0];
        for (int value : array.getElements()) {
            if (value < min) {
                min = value;
            }
        }
        return min;
    }

    @Override
    public int findMax(CustomArray array) {
        int max = array.getElements()[0];
        for (int value : array.getElements()) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }

    @Override
    public int sum(CustomArray array) {
        int sum = 0;
        for (int value : array.getElements()) {
            sum += value;
        }
        return sum;
    }
}