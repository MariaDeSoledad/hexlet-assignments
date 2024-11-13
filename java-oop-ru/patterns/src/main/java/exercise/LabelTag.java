package exercise;

// BEGIN
public class LabelTag implements TagInterface {
    private String text;
    private TagInterface inputTag;
    public LabelTag(String text, TagInterface inputTag) {
        this.text = text;
        this.inputTag = inputTag;
    }
    @Override
    public String render() {
        return String.format("<label>%s%s</label>", text, inputTag.render());
    }
}
// END
