package by.alexeibut.ft.serviceimpl;

import by.alexeibut.ft.entity.CustomArray;
import by.alexeibut.ft.service.SortService;

public class SortServiceImpl implements SortService {

    @Override
    public void bubbleSort(CustomArray array) {
        int[] arr = array.getElements();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    @Override
    public void selectionSort(CustomArray array) {
        int[] arr = array.getElements();
        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }
}