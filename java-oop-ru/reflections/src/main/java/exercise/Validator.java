package exercise;

import javax.swing.*;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

// BEGIN
public class Validator {
    public static List<String> validate(Address address) {
        List<String> errors = new ArrayList<>();
        for (Field field : address.getClass().getDeclaredFields()) {
            if (field.isAnnotationPresent(NotNull.class)) {
                field.setAccessible(true);
                try {
                    var value = field.get(address);
                    if (value == null) {
                        errors.add(field.getName());
                    }
                } catch (IllegalAccessException e) {
                    throw new RuntimeException("Ошибка при доступе к полю: " + field.getName(), e);
                }
            }
        }
        return errors;
    }
}
// END
