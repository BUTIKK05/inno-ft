package by.alexeibut.ft.validator;

import java.util.List;

public class ArrayXmlValidator {

    private static final String NUMBER_REGEX = "-?\\d+";

    public boolean isValid(List<String> values) {
        if (values.isEmpty()) {
            return false;
        }
        for (String value : values) {
            if (!value.matches(NUMBER_REGEX)) {
                return false;
            }
        }
        return true;
    }
}