import java.util.Arrays;

public class Figures {

   /* Figures(int a) {

    }*/

    void print(int a) {
        String b = String.valueOf(a)+ " ";
        char[] c = b.toCharArray();
        Character[][] array;

        for (int i = 0; i < c.length; i++) {


            if (c[i]=='1'){

                 array =new Character[][]
                                {{' ', ' ', ' ', '@'},
                                 {' ', ' ', '@', '@'},
                                 {' ', '@', ' ', '@'},
                                 {'@', ' ', ' ', '@'},
                                 {' ', ' ', ' ', '@'},
                                 {' ', ' ', ' ', '@'},
                                 {' ', ' ', ' ', '@'}};
                //array = new Character[array.length][];
                for (int j = 0; j <array.length ; j++) {
                    for (int k = 0; k <array[0].length ; k++) {
                        System.out.print(array[j][k]);
                    }
                    System.out.println();
                }


            }

            if (c[i]=='2'){

                Character[][] array2 =
                        {{' ','@','@',' '},
                                {'@',' ',' ','@'},
                                {' ',' ','@',' '},
                                {' ','@',' ',' '},
                                {'@',' ',' ',' '},
                                {'@',' ',' ',' '},
                                {'@','@','@','@'}};
                for (int j = 0; j <array2.length ; j++) {
                    for (int k = 0; k <array2[0].length ; k++) {
                        System.out.print(array2[j][k]);
                    }
                    System.out.println();
                }

            }
            if (c[i]=='3'){

                Character[][] array3 =
                        {{' ','@','@',' '},
                                {'@',' ',' ','@'},
                                {' ',' ','@',' '},
                                {' ','@',' ',' '},
                                {' ',' ','@',' '},
                                {'@',' ',' ','@'},
                                {' ','@','@',' '}};
                for (int j = 0; j <array3.length ; j++) {
                    for (int k = 0; k <array3[0].length ; k++) {
                        System.out.print(array3[j][k]);
                    }
                    System.out.println();
                }

            }


           /* switch (c[i]){
                case '1':
                    Character[][] array1 =
                                   {{' ',' ',' ','@'},
                                    {' ',' ','@','@'},
                                    {' ','@',' ','@'},
                                    {'@',' ',' ','@'},
                                    {' ',' ',' ','@'},
                                    {' ',' ',' ','@'},
                                    {' ',' ',' ','@'}};
                    for (int j = 0; j <array1.length ; j++) {
                        for (int k = 0; k <array1[0].length ; k++) {
                            System.out.print(array1[j][k]);
                        }
                        System.out.println();
                    }

                case '2':
                    Character[][] array2 =
                                   {{' ','@','@',' '},
                                    {'@',' ',' ','@'},
                                    {' ',' ','@',' '},
                                    {' ','@',' ',' '},
                                    {'@',' ',' ',' '},
                                    {'@',' ',' ',' '},
                                    {'@','@','@','@'}};
                    for (int j = 0; j <array2.length ; j++) {
                        for (int k = 0; k <array2[0].length ; k++) {
                            System.out.print(array2[j][k]);
                        }
                        System.out.println();
                    }
                case '3':
                    Character[][] array3 =
                                 {{' ','@','@',' '},
                                  {'@',' ',' ','@'},
                                  {' ',' ','@',' '},
                                  {' ','@',' ',' '},
                                  {' ',' ','@',' '},
                                  {'@',' ',' ','@'},
                                  {' ','@','@',' '}};
                    for (int j = 0; j <array3.length ; j++) {
                        for (int k = 0; k <array3[0].length ; k++) {
                            System.out.print(array3[j][k]);
                        }
                        System.out.println();
                    }
                case '4':
                    Character[][] array4 =
                                   {{' ',' ',' ','@'},
                                    {' ',' ','@','@'},
                                    {' ','@',' ','@'},
                                    {'@','@','@','@'},
                                    {' ',' ',' ','@'},
                                    {' ',' ',' ','@'},
                                    {' ',' ',' ','@'}};
                case '5':
                    Character[][] array5 =
                                   {{'@','@','@','@'},
                                    {'@',' ',' ',' '},
                                    {'@','@',' ',' '},
                                    {' ',' ','@',' '},
                                    {' ',' ',' ','@'},
                                    {' ',' ','@',' '},
                                    {'@','@',' ',' '}};

                case '6':
                    Character[][] array6 =
                                   {{' ','@','@',' '},
                                    {'@',' ',' ','@'},
                                    {'@',' ',' ',' '},
                                    {'@','@','@',' '},
                                    {'@',' ',' ','@'},
                                    {'@',' ',' ','@'},
                                    {' ','@','@',' '}};
            }*/


        }


    }

}
