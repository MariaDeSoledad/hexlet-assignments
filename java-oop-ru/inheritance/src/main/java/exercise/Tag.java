package exercise;

import java.util.stream.Collectors;
import java.util.Map;
import lombok.Getter;

// BEGIN
@Getter
public abstract class Tag {
    private String name;
    private Map<String, String> attributes;

    public Tag(String name, Map<String, String> attributes) {
        this.name = name;
        this.attributes = attributes;
    }

    public abstract String toString();

    protected String attributesToString() {
        return attributes.entrySet().stream()
                .map(entry -> entry.getKey() + "=\"" + entry.getValue() + "\"")
                .collect(Collectors.joining(" "));
    }
}
// END
