package exercise;

// BEGIN
public class MinThread extends Thread {
    private int[] numbers;
    private int min;

    public MinThread(int[] numbers) {
        this.numbers = numbers;
    }

    @Override
    public void run() {
        System.out.println("INFO: Thread " + getName() + " started");
        min = numbers[0];
        for (int num : numbers) {
            if (num < min) {
                min = num;
            }
        }
        System.out.println("INFO: Thread " + getName() + " finished");
    }

    public int getMin() {
        return min;
    }
}
// END
