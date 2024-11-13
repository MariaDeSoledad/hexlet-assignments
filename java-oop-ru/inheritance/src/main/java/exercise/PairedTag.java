package exercise;

import java.util.Map;
import java.util.List;
import java.util.stream.Collectors;

// BEGIN
public class PairedTag extends Tag{
    private String body;
    private List<Tag> list;

    public PairedTag(String name, Map<String, String> attributes, String body, List<Tag> list) {
        super(name, attributes);
        this.body = body;
        this.list = list;
    }

    @Override
    public String toString() {
        String attributes = attributesToString();
        String openingTag = attributes.isEmpty() ? "<" + getName() + ">" : "<" + getName() + " " + attributes + ">";
        String childrenString = list.stream()
                .map(Tag::toString)
                .collect(Collectors.joining());
        return openingTag + body + childrenString + "</" + getName() + ">";
    }
}
// END
