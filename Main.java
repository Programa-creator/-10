import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ValueCalculator valueCalculator = new ValueCalculator();


        valueCalculator.start();
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < valueCalculator.lenght/2; i++) {

                valueCalculator.a1[i] = (float)(valueCalculator.a1[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));

            }
        });
        t1.start();
        t1.join();

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < valueCalculator.lenght/2; i++) {

                valueCalculator.a2[i] = (float)(valueCalculator.a2[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));

            }
        });
        t2.start();
        t2.join();

        valueCalculator.t();
        long end = System.nanoTime();
        System.out.println("Took : " + ((end - valueCalculator.start) / 1000));
    }
}
