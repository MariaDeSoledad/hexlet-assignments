package exercise;

import lombok.Getter;

// BEGIN
@Getter
public class Point {
    private int x;
    private int y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
// END
