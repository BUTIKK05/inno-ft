package by.alexeibut.ft.service;

import by.alexeibut.ft.entity.CustomArray;

public interface ArrayService {
    int findMin(CustomArray array);
    int findMax(CustomArray array);
    int sum(CustomArray array);
}