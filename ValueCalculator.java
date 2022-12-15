import java.util.Arrays;

public class ValueCalculator {
    public static float[] arr = {1,2,3,4,5,6,7,8,9,10};
    public static float[] a1 = {0,0,0,0,0};
    public static float[] a2 = {0,0,0,0,0};

    long start;
    int lenght = arr.length;
    void arraylenght(){
        System.out.print(lenght+"\n");
        System.out.print(lenght/2+"\n");
    }

    void start(){
        start = System.nanoTime();

        Arrays.fill(arr, 1);

        System.arraycopy(arr, 0 , a1, 0, lenght/2);
        System.arraycopy(arr, lenght/2 , a2, 0, lenght/2);

        for (int i = 0; i < 5; i++) {
            System.out.print(a1[i]+" ");
        }
        System.out.print("\n");
        for (int i = 0; i < 5; i++) {
            System.out.print(a2[i]+" ");
        }
        System.out.print("\n");

    }
    void t(){
        System.arraycopy(a1, 0, arr, 0, lenght/2);
        System.arraycopy(a2, 0, arr, lenght/2, lenght/2);
        for (int i = 0; i < lenght; i++) {
            System.out.println(arr[i]);
        }
    }

}
