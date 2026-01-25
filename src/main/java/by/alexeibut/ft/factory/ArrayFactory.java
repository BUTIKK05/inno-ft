package by.alexeibut.ft.factory;

import by.alexeibut.ft.entity.CustomArray;

public interface ArrayFactory {
    CustomArray create(int[] elements);
}