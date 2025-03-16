package exercise;

// BEGIN
public class MaxThread extends Thread {
    private int[] numbers;
    private int max;

    public MaxThread(int[] numbers) {
        this.numbers = numbers;
    }

    @Override
    public void run() {
        System.out.println("INFO: Thread " + getName() + " started");
        max = numbers[0];
        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }
        System.out.println("INFO: Thread " + getName() + " finished");
    }

    public int getMax() {
        return max;
    }
}
// END
