package exercise;

// BEGIN
public class ReversedSequence implements CharSequence {
    private String original;

    public ReversedSequence(String original) {
        this.original = new StringBuilder(original).reverse().toString();
    }

    @Override
    public int length() {
        return original.length();
    }

    @Override
    public char charAt(int index) {
        return original.charAt(index);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return original.substring(start, end);
    }

    @Override
    public String toString() {
        return original;
    }
}
// END
