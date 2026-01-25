package by.alexeibut.ft.main;

import by.alexeibut.ft.entity.CustomArray;
import by.alexeibut.ft.exception.ArrayException;
import by.alexeibut.ft.factory.ArrayFactoryImpl;
import by.alexeibut.ft.reader.ArrayXmlReader;
import by.alexeibut.ft.validator.ArrayXmlValidator;

import java.util.List;

public class Main {

    private static final String PATH = "data/arrays.xml";

    public static void main(String[] args) throws ArrayException {

        ArrayXmlReader reader = new ArrayXmlReader();
        ArrayXmlValidator validator = new ArrayXmlValidator();
        ArrayFactoryImpl factory = new ArrayFactoryImpl();

        List<List<String>> rawArrays = reader.read(PATH);

        for (List<String> raw : rawArrays) {
            if (validator.isValid(raw)) {
                CustomArray array = factory.fromStringList(raw);
                System.out.println(array.getElements().length);
            }
        }
    }
}