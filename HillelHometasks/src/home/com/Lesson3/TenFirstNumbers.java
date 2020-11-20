package home.com.Lesson3;

public class TenFirstNumbers {
    public static void main(String[] args) {

        System.out.println("Ten first odd numbers are:");

        int[] array = new int[10];

        array[0] = 0;

        for (int i = 1; i <= array.length - 1; i++) {
            array[i] = array[i - 1] - 5;
            System.out.println(array[i]);
        }

    }

}
