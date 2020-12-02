package home.com.Lesson7;

public class Test {

    private String[] array;

    // метод добавления по индексу
    public String[] addIndex(String[] array, int index, String name) {
        this.array = array;


        for (int i = 0; i < 20; i++) {

            if (i == index) {
                array[i] = name;

                if (i >= array.length) {
                    String[]arrayNew = new String[i + (i >> 1)];
                    for (int j = 0; j < i; j++) {
                        arrayNew[j] = array[i];

                    }
                    array = arrayNew;
                }

            } if (index < 0) {
                System.out.println("Wrong");
            }
        }
        // System.out.println(Arrays.toString(arrayNew));
        return array;
    }
}
