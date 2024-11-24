package exercise;

import lombok.Value;
import com.fasterxml.jackson.databind.ObjectMapper;

// BEGIN
@Value
// END
class Car {
    int id;
    String brand;
    String model;
    String color;
    User owner;

    // BEGIN
    public String serialize() {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            return objectMapper.writeValueAsString(this);
        } catch (Exception e) {
            throw new RuntimeException("Failed to serialize Car object", e);
        }
    }

    public static Car deserialize(String json) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            return objectMapper.readValue(json, Car.class);
        } catch (Exception e) {
            throw new RuntimeException("Failed to deserialize Car object", e);
        }
    }
    // END
}
