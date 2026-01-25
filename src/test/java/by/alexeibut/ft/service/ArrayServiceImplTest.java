package by.alexeibut.ft.service;

import by.alexeibut.ft.entity.CustomArray;
import by.alexeibut.ft.serviceimpl.ArrayServiceImpl;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ArrayServiceImplTest {

    private static final CustomArray ARRAY =
            new CustomArray(new int[]{1, 2, 3});

    @Test
    void shouldFindMin() {
        ArrayService service = new ArrayServiceImpl();
        int result = service.findMin(ARRAY);
        assertEquals(1, result);
    }
}