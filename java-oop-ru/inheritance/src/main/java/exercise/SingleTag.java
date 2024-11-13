package exercise;

import java.util.Map;

// BEGIN
public class SingleTag extends Tag {

    public SingleTag(String name, Map<String, String> attributes) {
        super(name, attributes);
    }

    @Override
    public String toString() {
        String attributes = attributesToString();
        return attributes.isEmpty() ? "<" + getName() + ">" : "<" + getName() + " " + attributes + ">";
    }
}
// END
